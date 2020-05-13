package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PrmDemEtat generated by hbm2java
 */
@Entity
@Table(name = "PRM_DEM_ETAT", schema = "TOM")
public class PrmDemEtat implements java.io.Serializable {

	private short noEtat;
	private String etat;
	private String CEtatBpm;
	private Set<DemSuivi> demSuivis = new HashSet<DemSuivi>(0);
	private Set<PrmDemEtatOp> prmDemEtatOps = new HashSet<PrmDemEtatOp>(0);
	private Set<PrmDemMotif> prmDemMotifs = new HashSet<PrmDemMotif>(0);
	private Set<Demande> demandes = new HashSet<Demande>(0);
	private Set<Dunning> dunnings = new HashSet<Dunning>(0);

	public PrmDemEtat() {
	}

	public PrmDemEtat(short noEtat, String etat) {
		this.noEtat = noEtat;
		this.etat = etat;
	}

	public PrmDemEtat(short noEtat, String etat, String CEtatBpm, Set<DemSuivi> demSuivis,
			Set<PrmDemEtatOp> prmDemEtatOps, Set<PrmDemMotif> prmDemMotifs, Set<Demande> demandes,
			Set<Dunning> dunnings) {
		this.noEtat = noEtat;
		this.etat = etat;
		this.CEtatBpm = CEtatBpm;
		this.demSuivis = demSuivis;
		this.prmDemEtatOps = prmDemEtatOps;
		this.prmDemMotifs = prmDemMotifs;
		this.demandes = demandes;
		this.dunnings = dunnings;
	}

	@Id

	@Column(name = "NO_ETAT", unique = true, nullable = false, precision = 3, scale = 0)
	public short getNoEtat() {
		return this.noEtat;
	}

	public void setNoEtat(short noEtat) {
		this.noEtat = noEtat;
	}

	@Column(name = "ETAT", nullable = false, length = 100)
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Column(name = "C_ETAT_BPM", length = 200)
	public String getCEtatBpm() {
		return this.CEtatBpm;
	}

	public void setCEtatBpm(String CEtatBpm) {
		this.CEtatBpm = CEtatBpm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prmDemEtat")
	public Set<DemSuivi> getDemSuivis() {
		return this.demSuivis;
	}

	public void setDemSuivis(Set<DemSuivi> demSuivis) {
		this.demSuivis = demSuivis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prmDemEtat")
	public Set<PrmDemEtatOp> getPrmDemEtatOps() {
		return this.prmDemEtatOps;
	}

	public void setPrmDemEtatOps(Set<PrmDemEtatOp> prmDemEtatOps) {
		this.prmDemEtatOps = prmDemEtatOps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prmDemEtat")
	public Set<PrmDemMotif> getPrmDemMotifs() {
		return this.prmDemMotifs;
	}

	public void setPrmDemMotifs(Set<PrmDemMotif> prmDemMotifs) {
		this.prmDemMotifs = prmDemMotifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prmDemEtat")
	public Set<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prmDemEtat")
	public Set<Dunning> getDunnings() {
		return this.dunnings;
	}

	public void setDunnings(Set<Dunning> dunnings) {
		this.dunnings = dunnings;
	}

}
