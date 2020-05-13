package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UniteType generated by hbm2java
 */
@Entity
@Table(name = "UNITE_TYPE", schema = "TOM")
public class UniteType implements java.io.Serializable {

	private String CTypeUnite;
	private UniteType uniteType;
	private String typeUnite;
	private Set<UniteType> uniteTypes = new HashSet<UniteType>(0);
	private Set<PrmOtType> prmOtTypesForCTypeUniteSec = new HashSet<PrmOtType>(0);
	private Set<Unite> unites = new HashSet<Unite>(0);
	private Set<PrmOtType> prmOtTypesForCTypeUnite = new HashSet<PrmOtType>(0);
	private Set<ProfilType> profilTypes = new HashSet<ProfilType>(0);

	public UniteType() {
	}

	public UniteType(String CTypeUnite, String typeUnite) {
		this.CTypeUnite = CTypeUnite;
		this.typeUnite = typeUnite;
	}

	public UniteType(String CTypeUnite, UniteType uniteType, String typeUnite, Set<UniteType> uniteTypes,
			Set<PrmOtType> prmOtTypesForCTypeUniteSec, Set<Unite> unites, Set<PrmOtType> prmOtTypesForCTypeUnite,
			Set<ProfilType> profilTypes) {
		this.CTypeUnite = CTypeUnite;
		this.uniteType = uniteType;
		this.typeUnite = typeUnite;
		this.uniteTypes = uniteTypes;
		this.prmOtTypesForCTypeUniteSec = prmOtTypesForCTypeUniteSec;
		this.unites = unites;
		this.prmOtTypesForCTypeUnite = prmOtTypesForCTypeUnite;
		this.profilTypes = profilTypes;
	}

	@Id

	@Column(name = "C_TYPE_UNITE", unique = true, nullable = false, length = 20)
	public String getCTypeUnite() {
		return this.CTypeUnite;
	}

	public void setCTypeUnite(String CTypeUnite) {
		this.CTypeUnite = CTypeUnite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_TYPE_UNITE_MERE")
	public UniteType getUniteType() {
		return this.uniteType;
	}

	public void setUniteType(UniteType uniteType) {
		this.uniteType = uniteType;
	}

	@Column(name = "TYPE_UNITE", nullable = false, length = 100)
	public String getTypeUnite() {
		return this.typeUnite;
	}

	public void setTypeUnite(String typeUnite) {
		this.typeUnite = typeUnite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uniteType")
	public Set<UniteType> getUniteTypes() {
		return this.uniteTypes;
	}

	public void setUniteTypes(Set<UniteType> uniteTypes) {
		this.uniteTypes = uniteTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uniteTypeByCTypeUniteSec")
	public Set<PrmOtType> getPrmOtTypesForCTypeUniteSec() {
		return this.prmOtTypesForCTypeUniteSec;
	}

	public void setPrmOtTypesForCTypeUniteSec(Set<PrmOtType> prmOtTypesForCTypeUniteSec) {
		this.prmOtTypesForCTypeUniteSec = prmOtTypesForCTypeUniteSec;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uniteType")
	public Set<Unite> getUnites() {
		return this.unites;
	}

	public void setUnites(Set<Unite> unites) {
		this.unites = unites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uniteTypeByCTypeUnite")
	public Set<PrmOtType> getPrmOtTypesForCTypeUnite() {
		return this.prmOtTypesForCTypeUnite;
	}

	public void setPrmOtTypesForCTypeUnite(Set<PrmOtType> prmOtTypesForCTypeUnite) {
		this.prmOtTypesForCTypeUnite = prmOtTypesForCTypeUnite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uniteType")
	public Set<ProfilType> getProfilTypes() {
		return this.profilTypes;
	}

	public void setProfilTypes(Set<ProfilType> profilTypes) {
		this.profilTypes = profilTypes;
	}

}
