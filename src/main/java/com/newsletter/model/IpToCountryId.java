package com.newsletter.model;

// Generated 29 sept. 2011 22:28:32 by Hibernate Tools 3.4.0.CR1

/**
 * IpToCountryId generated by hbm2java
 */
public class IpToCountryId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private double ipFrom;
	private double ipTo;

	public IpToCountryId() {
	}

	public IpToCountryId(double ipFrom, double ipTo) {
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
	}

	public double getIpFrom() {
		return this.ipFrom;
	}

	public void setIpFrom(double ipFrom) {
		this.ipFrom = ipFrom;
	}

	public double getIpTo() {
		return this.ipTo;
	}

	public void setIpTo(double ipTo) {
		this.ipTo = ipTo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IpToCountryId))
			return false;
		IpToCountryId castOther = (IpToCountryId) other;

		return (this.getIpFrom() == castOther.getIpFrom())
				&& (this.getIpTo() == castOther.getIpTo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIpFrom();
		result = 37 * result + (int) this.getIpTo();
		return result;
	}

}
