package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParcSuiviId generated by hbm2java
 */
@Embeddable
public class ParcSuiviId implements java.io.Serializable {

	private BigDecimal idParc;
	private Date DSuivi;

	public ParcSuiviId() {
	}

	public ParcSuiviId(BigDecimal idParc, Date DSuivi) {
		this.idParc = idParc;
		this.DSuivi = DSuivi;
	}

	@Column(name = "ID_PARC", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdParc() {
		return this.idParc;
	}

	public void setIdParc(BigDecimal idParc) {
		this.idParc = idParc;
	}

	@Column(name = "D_SUIVI", nullable = false, length = 11)
	public Date getDSuivi() {
		return this.DSuivi;
	}

	public void setDSuivi(Date DSuivi) {
		this.DSuivi = DSuivi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParcSuiviId))
			return false;
		ParcSuiviId castOther = (ParcSuiviId) other;

		return ((this.getIdParc() == castOther.getIdParc()) || (this.getIdParc() != null
				&& castOther.getIdParc() != null && this.getIdParc().equals(castOther.getIdParc())))
				&& ((this.getDSuivi() == castOther.getDSuivi()) || (this.getDSuivi() != null
						&& castOther.getDSuivi() != null && this.getDSuivi().equals(castOther.getDSuivi())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdParc() == null ? 0 : this.getIdParc().hashCode());
		result = 37 * result + (getDSuivi() == null ? 0 : this.getDSuivi().hashCode());
		return result;
	}

}