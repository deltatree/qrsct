package de.deltatree.tools.qrsct.showcase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.neovisionaries.i18n.CurrencyCode;

import de.deltatree.tools.qrsct.QRSCT;
import de.deltatree.tools.qrsct.QRSCTCharacterSetEnum;
import de.deltatree.tools.qrsct.QRSCTPurposeEnum;
import de.deltatree.tools.qrsct.QRSCTServiceTagEnum;
import de.deltatree.tools.qrsct.QRSCTVersionEnum;
import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

public class Example {

	public static void main(String[] args) throws IOException {

		String build = new QRSCT().serviceTag(QRSCTServiceTagEnum.DEFAULT).version(QRSCTVersionEnum.DEFAULT)
				.characterSet(QRSCTCharacterSetEnum.DEFAULT).bic("BHBLDEHHXXX") //$NON-NLS-1$
				.name("Franz Mustermaennchen") //$NON-NLS-1$
				.iban("DE71110220330123456789123456789876") //$NON-NLS-1$
				.amount(CurrencyCode.EUR, 99.11).purpose(QRSCTPurposeEnum.DEFAULT)
				.reference("egon 123 test : dankeschoen").hint("kein Hinweis") //$NON-NLS-1$ //$NON-NLS-2$
				.build();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		QRCode.from(build).to(ImageType.PNG).withCharset("UTF-8").withSize(640, 480) //$NON-NLS-1$
				.withErrorCorrection(ErrorCorrectionLevel.M).writeTo(bos); // $NON-NLS-1$
		bos.close();

		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon(bos.toByteArray());
		JLabel label = new JLabel(icon);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
