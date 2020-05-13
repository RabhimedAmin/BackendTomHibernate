package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrmDemMotif generated by hbm2java
 */
@Entity
@Table(name = "PRM_DEM_MOTIF", schema = "TOM")
public class PrmDemMotif implements java.io.Serializable {

	private PrmDemMotifId id;
	private Motif motif;
	private Operation operation;
	private PrmDemEtat prmDemEtat;

	public PrmDemMotif() {
	}

	public PrmDemMotif(PrmDemMotifId id, Motif motif, Operation operation, PrmDemEtat prmDemEtat) {
		this.id = id;
		this.motif = motif;
		this.operation = operation;
		this.prmDemEtat = prmDemEtat;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "CMotif", column = @Column(name = "C_MOTIF", nullable = false, length = 100)),
			@AttributeOverride(name = "COp", column = @Column(name = "C_OP", nullable = false, length = 20)),
			@AttributeOverride(name = "noEtat", column = @Column(name = "NO_ETAT", nullable = false, precision = 3, scale = 0)) })
	public PrmDemMotifId getId() {
		return this.id;
	}

	public void setId(PrmDemMotifId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_MOTIF", nullable = false, insertable = false, updatable = false)
	public Motif getMotif() {
		return this.motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_OP", nullable = false, insertable = false, updatable = false)
	public Operation getOperation() {
		return this.operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NO_ETAT", nullable = false, insertable = false, updatable = false)
	public PrmDemEtat getPrmDemEtat() {
		return this.prmDemEtat;
	}

	public void setPrmDemEtat(PrmDemEtat prmDemEtat) {
		this.prmDemEtat = prmDemEtat;
	}

}