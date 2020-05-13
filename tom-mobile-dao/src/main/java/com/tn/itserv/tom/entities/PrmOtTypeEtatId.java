package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:52:19 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrmOtTypeEtatId generated by hbm2java
 */
@Embeddable
public class PrmOtTypeEtatId implements java.io.Serializable {

	private String CTypeOt;
	private short noEtat;

	public PrmOtTypeEtatId() {
	}

	public PrmOtTypeEtatId(String CTypeOt, short noEtat) {
		this.CTypeOt = CTypeOt;
		this.noEtat = noEtat;
	}

	@Column(name = "C_TYPE_OT", nullable = false, length = 20)
	public String getCTypeOt() {
		return this.CTypeOt;
	}

	public void setCTypeOt(String CTypeOt) {
		this.CTypeOt = CTypeOt;
	}

	@Column(name = "NO_ETAT", nullable = false, precision = 3, scale = 0)
	public short getNoEtat() {
		return this.noEtat;
	}

	public void setNoEtat(short noEtat) {
		this.noEtat = noEtat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrmOtTypeEtatId))
			return false;
		PrmOtTypeEtatId castOther = (PrmOtTypeEtatId) other;

		return ((this.getCTypeOt() == castOther.getCTypeOt()) || (this.getCTypeOt() != null
				&& castOther.getCTypeOt() != null && this.getCTypeOt().equals(castOther.getCTypeOt())))
				&& (this.getNoEtat() == castOther.getNoEtat());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCTypeOt() == null ? 0 : this.getCTypeOt().hashCode());
		result = 37 * result + this.getNoEtat();
		return result;
	}

}
