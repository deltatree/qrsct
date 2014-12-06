package de.deltatree.tools.qrsct;

import java.nio.charset.Charset;

public enum QRSCTCharacterSetEnum {
	UTF_8("1", Charset.forName("UTF-8")), //$NON-NLS-1$ //$NON-NLS-2$
	ISO_8859_1("2", Charset.forName("ISO-8859-1")), //$NON-NLS-1$ //$NON-NLS-2$
	ISO_8859_2("3", Charset.forName("ISO-8859-2")), //$NON-NLS-1$ //$NON-NLS-2$
	ISO_8859_4("4", Charset.forName("ISO-8859-4")), //$NON-NLS-1$ //$NON-NLS-2$
	ISO_8859_5("5", Charset.forName("ISO-8859-5")), //$NON-NLS-1$ //$NON-NLS-2$
	ISO_8859_7("6", Charset.forName("ISO-8859-7")), //$NON-NLS-1$ //$NON-NLS-2$
	// ISO_8859_10("7", Charset.forName("ISO-8859-10")), //not supported!!! =>
	// java.nio.charset.UnsupportedCharsetException
	ISO_8859_15("8", Charset.forName("ISO-8859-15")); //$NON-NLS-1$ //$NON-NLS-2$

	public final static QRSCTCharacterSetEnum DEFAULT = QRSCTCharacterSetEnum.UTF_8;

	private final String characterSetId;
	private final Charset charset;

	private QRSCTCharacterSetEnum(String characterSetId, Charset charset) {
		this.characterSetId = characterSetId;
		this.charset = charset;
	}

	public String getCharacterSetId() {
		return this.characterSetId;
	}

	public Charset getCharset() {
		return this.charset;
	}
}
