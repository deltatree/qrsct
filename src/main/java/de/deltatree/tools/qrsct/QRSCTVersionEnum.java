package de.deltatree.tools.qrsct;

public enum QRSCTVersionEnum {
	V1("001"); //$NON-NLS-1$

	public static final QRSCTVersionEnum DEFAULT = QRSCTVersionEnum.V1;
	private final String versionId;

	private QRSCTVersionEnum(String versionId) {
		this.versionId = versionId;
	}

	public String getVersionId() {
		return versionId;
	}

}
