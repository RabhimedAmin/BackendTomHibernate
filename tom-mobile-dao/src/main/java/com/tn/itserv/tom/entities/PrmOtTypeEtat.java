package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:52:19 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PrmOtTypeEtat generated by hbm2java
 */
@Entity
@Table(name = "PRM_OT_TYPE_ETAT", schema = "TOM")
public class PrmOtTypeEtat implements java.io.Serializable {

	private PrmOtTypeEtatId id;

	public PrmOtTypeEtat() {
	}

	public PrmOtTypeEtat(PrmOtTypeEtatId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "CTypeOt", column = @Column(name = "C_TYPE_OT", nullable = false, length = 20)),
			@AttributeOverride(name = "noEtat", column = @Column(name = "NO_ETAT", nullable = false, precision = 3, scale = 0)) })
	public PrmOtTypeEtatId getId() {
		return this.id;
	}

	public void setId(PrmOtTypeEtatId id) {
		this.id = id;
	}

}
