package de.deltatree.tools.qrsct;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.neovisionaries.i18n.CurrencyCode;

/*
 * Quick Response (QR) for a SEPA Credit Transfer (SCT) builder
 */
public class QRSCT {

	private static Pattern SEPA_INVALID_SIGNS = Pattern.compile(
			"[^A-Za-z0-9/-\\?:\\(\\)\\.,\\+\\s{1}]{1,}", Pattern.MULTILINE);

	private QRSCTServiceTagEnum serviceTag = QRSCTServiceTagEnum.DEFAULT;
	private QRSCTVersionEnum version = QRSCTVersionEnum.DEFAULT;
	private QRSCTCharacterSetEnum characterSet = QRSCTCharacterSetEnum.DEFAULT;
	private final static String IDENTIFICATION_CODE = "SCT"; //$NON-NLS-1$
	private final static double AMOUNT_MAX = 999999999.99;
	private final static double AMOUNT_MIN = 0.01;
	private String reference = ""; //$NON-NLS-1$
	private String text = ""; //$NON-NLS-1$
	private String hint = ""; //$NON-NLS-1$
	private QRSCTPurposeEnum purpose = QRSCTPurposeEnum.DEFAULT;

	// mandatory fields
	private String bic;
	private String name;
	private String iban;
	private String amount;

	public QRSCT serviceTag(QRSCTServiceTagEnum serviceTag) {
		if (serviceTag != null) {
			this.serviceTag = serviceTag;
			return this;
		}
		throw new IllegalArgumentException("supplied serviceTag [" + serviceTag //$NON-NLS-1$
				+ "] not valid: has to be not null"); //$NON-NLS-1$
	}

	public String build() throws UnsupportedEncodingException {
		StringBuilder data = new StringBuilder();
		data.append(this.serviceTag.getServiceTagId()); // 3 - BCD
														// (Servicekennung)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.version.getVersionId()); // 3 - 001 (Version)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.characterSet.getCharacterSetId()); // 1 -
															// 1,2,3,4,5,6,7,8
															// (Kodierung)
		data.append("\n"); //$NON-NLS-1$
		data.append(IDENTIFICATION_CODE); // 3 - SCT (Funktion)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.bic); // 8 oder 11 - (BIC EmpfängerBank)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.name); // 70 (Name
								// Empfänger/KontoInhaber)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.iban); // 34 (IBAN
								// EmpfängerKonto)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.amount); // 12 - (Betrag in Euro)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.purpose.getPurposeId()); // 4 - (Geschäftscode)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.reference); // Zahlungsreferenz(35)
		data.append("\n"); //$NON-NLS-1$
		data.append(this.text); // oder Text(140)
		if (this.hint != null) {
			data.append("\n"); //$NON-NLS-1$
			data.append(this.hint); // 70 Hinweis
		}

		// The total payload is limited to 331 bytes
		String string = data.toString();
		int payloadLength = string.getBytes("UTF-8").length; //$NON-NLS-1$
		if (payloadLength > 331) {
			throw new IllegalStateException(
					"total payload is greater than 331 bytes => " //$NON-NLS-1$
							+ payloadLength);
		}
		return string;
	}

	public QRSCT version(QRSCTVersionEnum version) {
		if (version != null) {
			this.version = version;
			return this;
		}
		throw new IllegalArgumentException("supplied version [" + version //$NON-NLS-1$
				+ "] not valid: has to be not null"); //$NON-NLS-1$
	}

	public QRSCT characterSet(QRSCTCharacterSetEnum characterSet) {
		if (characterSet != null) {
			this.characterSet = characterSet;
			return this;
		}
		throw new IllegalArgumentException("supplied characterSet [" //$NON-NLS-1$
				+ characterSet + "] not valid: has to be not null"); //$NON-NLS-1$
	}

	public QRSCT bic(String bic) {
		if (bic != null && (bic.length() == 8 || bic.length() == 11)) {
			this.bic = checkValidSigns(bic);
			return this;
		}
		throw new IllegalArgumentException("supplied bic [" + bic //$NON-NLS-1$
				+ "] not valid: has to be not null and of length 8 or 11"); //$NON-NLS-1$
	}

	public QRSCT name(String name) {
		if (name != null && name.length() <= 70) {
			this.name = checkValidSigns(name);
			return this;
		}
		throw new IllegalArgumentException("supplied name [" + name //$NON-NLS-1$
				+ "] not valid: has to be not null and of max length 70"); //$NON-NLS-1$
	}

	public QRSCT iban(String iban) {
		if (iban != null && iban.length() <= 34) {
			this.iban = checkValidSigns(iban);
			return this;
		}
		throw new IllegalArgumentException("supplied iban [" + iban //$NON-NLS-1$
				+ "] not valid: has to be not null and of max length 34"); //$NON-NLS-1$
	}

	public QRSCT amount(CurrencyCode currency, double value) {
		if (currency != null) {
			this.amount = calc(currency, value);
			return this;
		}
		throw new IllegalArgumentException("supplied currency [" + currency //$NON-NLS-1$
				+ "] not valid: has to be not null"); //$NON-NLS-1$
	}

	private String calc(CurrencyCode currency, double value) {
		if (value >= AMOUNT_MIN && value <= AMOUNT_MAX) {
			StringBuffer r = new StringBuffer();
			r.append(currency.name());
			r.append(renderAmount(value));
			return r.toString();
		}
		throw new IllegalArgumentException("supplied value [" + value //$NON-NLS-1$
				+ "] not valid: has to be min [" //$NON-NLS-1$
				+ renderAmount(AMOUNT_MIN) + "] or max [" //$NON-NLS-1$
				+ renderAmount(AMOUNT_MAX) + "]"); //$NON-NLS-1$
	}

	private String renderAmount(double value) {
		return createSpecialDecimalFormat().format(value);
	}

	private DecimalFormat createSpecialDecimalFormat() {
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		return new DecimalFormat("0.00", //$NON-NLS-1$
				dfs);
	}

	public QRSCT purpose(QRSCTPurposeEnum purpose) {
		this.purpose = purpose;
		return this;
	}

	/**
	 * Sets the reference of this builder !!!If you set this attribute,
	 * attribute text will be reset to an empty string!!! It's only possible to
	 * define one of these attributes
	 *
	 * @param reference
	 *            reference (max length: 35)
	 * @return QRSCT builder
	 */
	public QRSCT reference(String reference) {
		if (reference != null && reference.length() <= 35) {
			this.text = ""; //$NON-NLS-1$
			this.reference = checkValidSigns(reference);
			return this;
		}
		throw new IllegalArgumentException("supplied reference [" + reference //$NON-NLS-1$
				+ "] not valid: has to be not null and of max length 35"); //$NON-NLS-1$
	}

	/**
	 * Sets the text of this builder !!!If you set this attribute, attribute
	 * reference will be reset to an empty string!!! It's only possible to
	 * define one of these attributes
	 *
	 * @param text
	 *            text (max length: 140)
	 * @return QRSCT builder
	 */
	public QRSCT text(String text) {
		if (text != null && text.length() <= 140) {
			this.reference = ""; //$NON-NLS-1$
			this.text = checkValidSigns(text);
			return this;
		}
		throw new IllegalArgumentException("supplied text [" + text //$NON-NLS-1$
				+ "] not valid: has to be not null and of max length 140"); //$NON-NLS-1$
	}

	public QRSCT hint(String hint) {
		if (hint != null && hint.length() <= 70) {
			this.hint = checkValidSigns(hint);
			return this;
		}
		throw new IllegalArgumentException("supplied hint [" + hint //$NON-NLS-1$
				+ "] not valid:  has to be not null and of max length 70"); //$NON-NLS-1$
	}

	public String checkValidSigns(String check) {
		if (check != null) {
			StringBuffer sb = new StringBuffer();
			Matcher matcher = SEPA_INVALID_SIGNS.matcher(check);
			while (matcher.find()) {
				sb.append(matcher.group());
			}
			if (sb.length() > 0) {
				throw new IllegalStateException("signs not valid ["
						+ sb.toString() + "] in [" + check + "]");
			}
		}
		return check;
	}
}
