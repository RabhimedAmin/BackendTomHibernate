package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParcServId generated by hbm2java
 */
@Embeddable
public class ParcServId implements java.io.Serializable {

	private BigDecimal idParc;
	private String CTypeServ;

	public ParcServId() {
	}

	public ParcServId(BigDecimal idParc, String CTypeServ) {
		this.idParc = idParc;
		this.CTypeServ = CTypeServ;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParcServId))
			return false;
		ParcServId castOther = (ParcServId) other;

		return ((this.getIdParc() == castOther.getIdParc()) || (this.getIdParc() != null
				&& castOther.getIdParc() != null && this.getIdParc().equals(castOther.getIdParc())))
				&& ((this.getCTypeServ() == castOther.getCTypeServ()) || (this.getCTypeServ() != null
						&& castOther.getCTypeServ() != null && this.getCTypeServ().equals(castOther.getCTypeServ())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdParc() == null ? 0 : this.getIdParc().hashCode());
		result = 37 * result + (getCTypeServ() == null ? 0 : this.getCTypeServ().hashCode());
		return result;
	}

}