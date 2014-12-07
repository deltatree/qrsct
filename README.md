qrsct
=====

reference implementation: QR-code for sepa credit transfers (SCT) => in germany: girocode

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
				.name("Franz Mustermännchen") //$NON-NLS-1$
				.iban("DE71110220330123456789123456789876") //$NON-NLS-1$
				.amount(CurrencyCode.EUR, 999999999.11)
				.purpose(QRSCTPurposeEnum.DEFAULT)
				.reference("egon 123 test - dankeschön").hint("keiner :-)") //$NON-NLS-1$ //$NON-NLS-2$
				.build();

		QRCode.from(build).to(ImageType.PNG).withCharset("UTF-8") //$NON-NLS-1$
				.withErrorCorrection(ErrorCorrectionLevel.M)
				.writeTo(new FileOutputStream(new File("test.png"))); //$NON-NLS-1$
		;
```