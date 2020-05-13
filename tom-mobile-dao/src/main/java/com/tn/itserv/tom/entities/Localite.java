package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Localite generated by hbm2java
 */
@Entity
@Table(name = "LOCALITE", schema = "TOM")
public class Localite implements java.io.Serializable {

	private String CLoc;
	private Delegation delegation;
	private String loc;
	private String CPostal;
	private String idLoc;
	private String CPostalSyratt;
	private String CPostalSig;
	private Set<Parc> parcs = new HashSet<Parc>(0);
	private Set<Demande> demandes = new HashSet<Demande>(0);
	private Set<ParcSuivi> parcSuivis = new HashSet<ParcSuivi>(0);
	private Set<Unite> unites = new HashSet<Unite>(0);

	public Localite() {
	}

	public Localite(String CLoc, Delegation delegation, String loc, String idLoc) {
		this.CLoc = CLoc;
		this.delegation = delegation;
		this.loc = loc;
		this.idLoc = idLoc;
	}

	public Localite(String CLoc, Delegation delegation, String loc, String CPostal, String idLoc, String CPostalSyratt,
			String CPostalSig, Set<Parc> parcs, Set<Demande> demandes, Set<ParcSuivi> parcSuivis, Set<Unite> unites) {
		this.CLoc = CLoc;
		this.delegation = delegation;
		this.loc = loc;
		this.CPostal = CPostal;
		this.idLoc = idLoc;
		this.CPostalSyratt = CPostalSyratt;
		this.CPostalSig = CPostalSig;
		this.parcs = parcs;
		this.demandes = demandes;
		this.parcSuivis = parcSuivis;
		this.unites = unites;
	}

	@Id

	@Column(name = "C_LOC", unique = true, nullable = false, length = 10)
	public String getCLoc() {
		return this.CLoc;
	}

	public void setCLoc(String CLoc) {
		this.CLoc = CLoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_DELEG", nullable = false)
	public Delegation getDelegation() {
		return this.delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

	@Column(name = "LOC", nullable = false, length = 100)
	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Column(name = "C_POSTAL", length = 10)
	public String getCPostal() {
		return this.CPostal;
	}

	public void setCPostal(String CPostal) {
		this.CPostal = CPostal;
	}

	@Column(name = "ID_LOC", nullable = false, length = 10)
	public String getIdLoc() {
		return this.idLoc;
	}

	public void setIdLoc(String idLoc) {
		this.idLoc = idLoc;
	}

	@Column(name = "C_POSTAL_SYRATT", length = 200)
	public String getCPostalSyratt() {
		return this.CPostalSyratt;
	}

	public void setCPostalSyratt(String CPostalSyratt) {
		this.CPostalSyratt = CPostalSyratt;
	}

	@Column(name = "C_POSTAL_SIG", length = 200)
	public String getCPostalSig() {
		return this.CPostalSig;
	}

	public void setCPostalSig(String CPostalSig) {
		this.CPostalSig = CPostalSig;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localite")
	public Set<Parc> getParcs() {
		return this.parcs;
	}

	public void setParcs(Set<Parc> parcs) {
		this.parcs = parcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localite")
	public Set<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localite")
	public Set<ParcSuivi> getParcSuivis() {
		return this.parcSuivis;
	}

	public void setParcSuivis(Set<ParcSuivi> parcSuivis) {
		this.parcSuivis = parcSuivis;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "UNITE_LOCALITE", schema = "TOM", joinColumns = {
			@JoinColumn(name = "C_LOC", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "C_UNITE", nullable = false, updatable = false) })
	public Set<Unite> getUnites() {
		return this.unites;
	}

	public void setUnites(Set<Unite> unites) {
		this.unites = unites;
	}

}