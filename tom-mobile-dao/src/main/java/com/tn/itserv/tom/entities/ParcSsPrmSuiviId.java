package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParcSsPrmSuiviId generated by hbm2java
 */
@Embeddable
public class ParcSsPrmSuiviId implements java.io.Serializable {

	private BigDecimal idParc;
	private Date DSuivi;
	private short noSs;
	private short noValSs;

	public ParcSsPrmSuiviId() {
	}

	public ParcSsPrmSuiviId(BigDecimal idParc, Date DSuivi, short noSs, short noValSs) {
		this.idParc = idParc;
		this.DSuivi = DSuivi;
		this.noSs = noSs;
		this.noValSs = noValSs;
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

	@Column(name = "NO_SS", nullable = false, precision = 3, scale = 0)
	public short getNoSs() {
		return this.noSs;
	}

	public void setNoSs(short noSs) {
		this.noSs = noSs;
	}

	@Column(name = "NO_VAL_SS", nullable = false, precision = 3, scale = 0)
	public short getNoValSs() {
		return this.noValSs;
	}

	public void setNoValSs(short noValSs) {
		this.noValSs = noValSs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParcSsPrmSuiviId))
			return false;
		ParcSsPrmSuiviId castOther = (ParcSsPrmSuiviId) other;

		return ((this.getIdParc() == castOther.getIdParc()) || (this.getIdParc() != null
				&& castOther.getIdParc() != null && this.getIdParc().equals(castOther.getIdParc())))
				&& ((this.getDSuivi() == castOther.getDSuivi()) || (this.getDSuivi() != null
						&& castOther.getDSuivi() != null && this.getDSuivi().equals(castOther.getDSuivi())))
				&& (this.getNoSs() == castOther.getNoSs()) && (this.getNoValSs() == castOther.getNoValSs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdParc() == null ? 0 : this.getIdParc().hashCode());
		result = 37 * result + (getDSuivi() == null ? 0 : this.getDSuivi().hashCode());
		result = 37 * result + this.getNoSs();
		result = 37 * result + this.getNoValSs();
		return result;
	}

}
