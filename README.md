qrsct
=====

java reference implementation: QR-code for sepa credit transfers (SCT) => in germany: girocode

demo-link
=====

http://qrsct.deltatree.de/dtapp/qrsct/

maven
=====
```
		<dependency>
			<groupId>de.deltatree.tools</groupId>
			<artifactId>qrsct</artifactId>
			<version>1.1.2</version>
		</dependency>
```

usage
=====

see showcase: https://github.com/deltatree/qrsct/blob/master/src/test/java/de/deltatree/tools/qrsct/showcase/Example.java

Showcase is using https://github.com/zxing/zxing:

```
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
```