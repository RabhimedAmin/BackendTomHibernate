package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParcServSuiviId generated by hbm2java
 */
@Embeddable
public class ParcServSuiviId implements java.io.Serializable {

	private BigDecimal idParc;
	private String CTypeServ;
	private Date DSuivi;

	public ParcServSuiviId() {
	}

	public ParcServSuiviId(BigDecimal idParc, String CTypeServ, Date DSuivi) {
		this.idParc = idParc;
		this.CTypeServ = CTypeServ;
		this.DSuivi = DSuivi;
	}

	@Column(name = "ID_PARC", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdParc() {
		return this.idParc;
	}

	public void setIdParc(BigDecimal idParc) {
		this.idParc = idParc;
	}

	@Column(name = "C_TYPE_SERV", nullable = false, length = 20)
	public String getCTypeServ() {
		return this.CTypeServ;
	}

	public void setCTypeServ(String CTypeServ) {
		this.CTypeServ = CTypeServ;
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
		if (!(other instanceof ParcServSuiviId))
			return false;
		ParcServSuiviId castOther = (ParcServSuiviId) other;

		return ((this.getIdParc() == castOther.getIdParc()) || (this.getIdParc() != null
				&& castOther.getIdParc() != null && this.getIdParc().equals(castOther.getIdParc())))
				&& ((this.getCTypeServ() == castOther.getCTypeServ()) || (this.getCTypeServ() != null
						&& castOther.getCTypeServ() != null && this.getCTypeServ().equals(castOther.getCTypeServ())))
				&& ((this.getDSuivi() == castOther.getDSuivi()) || (this.getDSuivi() != null
						&& castOther.getDSuivi() != null && this.getDSuivi().equals(castOther.getDSuivi())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdParc() == null ? 0 : this.getIdParc().hashCode());
		result = 37 * result + (getCTypeServ() == null ? 0 : this.getCTypeServ().hashCode());
		result = 37 * result + (getDSuivi() == null ? 0 : this.getDSuivi().hashCode());
		return result;
	}

}