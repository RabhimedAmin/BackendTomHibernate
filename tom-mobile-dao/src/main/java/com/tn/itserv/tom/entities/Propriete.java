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
 * Propriete generated by hbm2java
 */
@Entity
@Table(name = "PROPRIETE", schema = "TOM")
public class Propriete implements java.io.Serializable {

	private String CProp;
	private String prop;
	private String type;
	private String systemeSrc;
	private String CPropSrc;
	private String classe;
	private Boolean rendered;
	private Set<DunningOtProp> dunningOtProps = new HashSet<DunningOtProp>(0);
	private Set<DunningProp> dunningProps = new HashSet<DunningProp>(0);
	private Set<ParcProp> parcProps = new HashSet<ParcProp>(0);
	private Set<ParcPropSuivi> parcPropSuivis = new HashSet<ParcPropSuivi>(0);
	private Set<OtProp> otProps = new HashSet<OtProp>(0);
	private Set<PrmTypeOtProp> prmTypeOtProps = new HashSet<PrmTypeOtProp>(0);
	private Set<DemProp> demProps = new HashSet<DemProp>(0);
	private Set<DenumOfficeProp> denumOfficeProps = new HashSet<DenumOfficeProp>(0);

	public Propriete() {
	}

	public Propriete(String CProp, String prop, String type) {
		this.CProp = CProp;
		this.prop = prop;
		this.type = type;
	}

	public Propriete(String CProp, String prop, String type, String systemeSrc, String CPropSrc, String classe,
			Boolean rendered, Set<DunningOtProp> dunningOtProps, Set<DunningProp> dunningProps, Set<ParcProp> parcProps,
			Set<ParcPropSuivi> parcPropSuivis, Set<OtProp> otProps, Set<PrmTypeOtProp> prmTypeOtProps,
			Set<DemProp> demProps, Set<DenumOfficeProp> denumOfficeProps) {
		this.CProp = CProp;
		this.prop = prop;
		this.type = type;
		this.systemeSrc = systemeSrc;
		this.CPropSrc = CPropSrc;
		this.classe = classe;
		this.rendered = rendered;
		this.dunningOtProps = dunningOtProps;
		this.dunningProps = dunningProps;
		this.parcProps = parcProps;
		this.parcPropSuivis = parcPropSuivis;
		this.otProps = otProps;
		this.prmTypeOtProps = prmTypeOtProps;
		this.demProps = demProps;
		this.denumOfficeProps = denumOfficeProps;
	}

	@Id

	@Column(name = "C_PROP", unique = true, nullable = false, length = 50)
	public String getCProp() {
		return this.CProp;
	}

	public void setCProp(String CProp) {
		this.CProp = CProp;
	}

	@Column(name = "PROP", nullable = false, length = 100)
	public String getProp() {
		return this.prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	@Column(name = "TYPE", nullable = false, length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "SYSTEME_SRC", length = 20)
	public String getSystemeSrc() {
		return this.systemeSrc;
	}

	public void setSystemeSrc(String systemeSrc) {
		this.systemeSrc = systemeSrc;
	}

	@Column(name = "C_PROP_SRC", length = 50)
	public String getCPropSrc() {
		return this.CPropSrc;
	}

	public void setCPropSrc(String CPropSrc) {
		this.CPropSrc = CPropSrc;
	}

	@Column(name = "CLASSE", length = 50)
	public String getClasse() {
		return this.classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Column(name = "RENDERED", precision = 1, scale = 0)
	public Boolean getRendered() {
		return this.rendered;
	}

	public void setRendered(Boolean rendered) {
		this.rendered = rendered;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<DunningOtProp> getDunningOtProps() {
		return this.dunningOtProps;
	}

	public void setDunningOtProps(Set<DunningOtProp> dunningOtProps) {
		this.dunningOtProps = dunningOtProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<DunningProp> getDunningProps() {
		return this.dunningProps;
	}

	public void setDunningProps(Set<DunningProp> dunningProps) {
		this.dunningProps = dunningProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<ParcProp> getParcProps() {
		return this.parcProps;
	}

	public void setParcProps(Set<ParcProp> parcProps) {
		this.parcProps = parcProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<ParcPropSuivi> getParcPropSuivis() {
		return this.parcPropSuivis;
	}

	public void setParcPropSuivis(Set<ParcPropSuivi> parcPropSuivis) {
		this.parcPropSuivis = parcPropSuivis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<OtProp> getOtProps() {
		return this.otProps;
	}

	public void setOtProps(Set<OtProp> otProps) {
		this.otProps = otProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<PrmTypeOtProp> getPrmTypeOtProps() {
		return this.prmTypeOtProps;
	}

	public void setPrmTypeOtProps(Set<PrmTypeOtProp> prmTypeOtProps) {
		this.prmTypeOtProps = prmTypeOtProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<DemProp> getDemProps() {
		return this.demProps;
	}

	public void setDemProps(Set<DemProp> demProps) {
		this.demProps = demProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "propriete")
	public Set<DenumOfficeProp> getDenumOfficeProps() {
		return this.denumOfficeProps;
	}

	public void setDenumOfficeProps(Set<DenumOfficeProp> denumOfficeProps) {
		this.denumOfficeProps = denumOfficeProps;
	}

}