package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ImpInSusp generated by hbm2java
 */
@Entity
@Table(name = "IMP_IN_SUSP", schema = "TOM")
public class ImpInSusp implements java.io.Serializable {

	private ImpInSuspId id;
	private ImpLog impLog;
	private String statutLigne;
	private String motifStatut;
	private String etat;
	private Date DEtat;
	private String motifEtat;

	public ImpInSusp() {
	}

	public ImpInSusp(ImpInSuspId id, ImpLog impLog, String statutLigne, String etat, Date DEtat) {
		this.id = id;
		this.impLog = impLog;
		this.statutLigne = statutLigne;
		this.etat = etat;
		this.DEtat = DEtat;
	}

	public ImpInSusp(ImpInSuspId id, ImpLog impLog, String statutLigne, String motifStatut, String etat, Date DEtat,
			String motifEtat) {
		this.id = id;
		this.impLog = impLog;
		this.statutLigne = statutLigne;
		this.motifStatut = motifStatut;
		this.etat = etat;
		this.DEtat = DEtat;
		this.motifEtat = motifEtat;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idImpLog", column = @Column(name = "ID_IMP_LOG", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "noLigne", column = @Column(name = "NO_LIGNE", nullable = false, precision = 15, scale = 0)) })
	public ImpInSuspId getId() {
		return this.id;
	}

	public void setId(ImpInSuspId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMP_LOG", nullable = false, insertable = false, updatable = false)
	public ImpLog getImpLog() {
		return this.impLog;
	}

	public void setImpLog(ImpLog impLog) {
		this.impLog = impLog;
	}

	@Column(name = "STATUT_LIGNE", nullable = false, length = 1)
	public String getStatutLigne() {
		return this.statutLigne;
	}

	public void setStatutLigne(String statutLigne) {
		this.statutLigne = statutLigne;
	}

	@Column(name = "MOTIF_STATUT", length = 100)
	public String getMotifStatut() {
		return this.motifStatut;
	}

	public void setMotifStatut(String motifStatut) {
		this.motifStatut = motifStatut;
	}

	@Column(name = "ETAT", nullable = false, length = 1)
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_ETAT", nullable = false, length = 11)
	public Date getDEtat() {
		return this.DEtat;
	}

	public void setDEtat(Date DEtat) {
		this.DEtat = DEtat;
	}

	@Column(name = "MOTIF_ETAT", length = 100)
	public String getMotifEtat() {
		return this.motifEtat;
	}

	public void setMotifEtat(String motifEtat) {
		this.motifEtat = motifEtat;
	}

}