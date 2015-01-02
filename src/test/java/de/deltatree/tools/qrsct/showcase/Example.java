package de.deltatree.tools.qrsct.showcase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.neovisionaries.i18n.CurrencyCode;

import de.deltatree.tools.qrsct.QRSCT;
import de.deltatree.tools.qrsct.QRSCTCharacterSetEnum;
import de.deltatree.tools.qrsct.QRSCTPurposeEnum;
import de.deltatree.tools.qrsct.QRSCTServiceTagEnum;
import de.deltatree.tools.qrsct.QRSCTVersionEnum;

public class Example {

	public static void main(String[] args) throws IOException {

		String build = new QRSCT()
				.serviceTag(QRSCTServiceTagEnum.DEFAULT)
				.version(QRSCTVersionEnum.DEFAULT)
				.characterSet(QRSCTCharacterSetEnum.DEFAULT)
				.bic("BHBLDEHHXXX") //$NON-NLS-1$
				.name("Franz Mustermaennchen") //$NON-NLS-1$
				.iban("DE71110220330123456789123456789876") //$NON-NLS-1$
				.amount(CurrencyCode.EUR, 999999999.11)
				.purpose(QRSCTPurposeEnum.DEFAULT)
				.reference("egon 123 test : dankeschoen").hint("kein Hinweis") //$NON-NLS-1$ //$NON-NLS-2$
				.build();

		FileOutputStream fileOutputStream = new FileOutputStream(new File(
				"C:/Temp/test.png"));
		QRCode.from(build).to(ImageType.PNG).withCharset("UTF-8") //$NON-NLS-1$
				.withErrorCorrection(ErrorCorrectionLevel.M)
				.writeTo(fileOutputStream); //$NON-NLS-1$
		fileOutputStream.close();
	}

}
