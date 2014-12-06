package de.deltatree.tools.qrsct;

public enum QRSCTServiceTagEnum {
	BCD("BCD"); //$NON-NLS-1$

	public final static QRSCTServiceTagEnum DEFAULT = QRSCTServiceTagEnum.BCD;

	private final String serviceTagId;

	private QRSCTServiceTagEnum(String serviceTagId) {
		this.serviceTagId = serviceTagId;
	}

	public String getServiceTagId() {
		return this.serviceTagId;
	}
}
