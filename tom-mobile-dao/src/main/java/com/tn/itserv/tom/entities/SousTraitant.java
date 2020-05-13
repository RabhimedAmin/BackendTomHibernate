package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SousTraitant generated by hbm2java
 */
@Entity
@Table(name = "SOUS_TRAITANT", schema = "TOM")
public class SousTraitant implements java.io.Serializable {

	private BigDecimal idStraitant;
	private String straitant;
	private String rc;
	private String adresse;
	private String contact;
	private String email;
	private String tel;
	private String obs;
	private Date DCreation;
	private String loginCreation;
	private Date DModif;
	private String loginModif;
	private Set<EquipeRess> equipeResses = new HashSet<EquipeRess>(0);

	public SousTraitant() {
	}

	public SousTraitant(BigDecimal idStraitant, String straitant) {
		this.idStraitant = idStraitant;
		this.straitant = straitant;
	}

	public SousTraitant(BigDecimal idStraitant, String straitant, String rc, String adresse, String contact,
			String email, String tel, String obs, Date DCreation, String loginCreation, Date DModif, String loginModif,
			Set<EquipeRess> equipeResses) {
		this.idStraitant = idStraitant;
		this.straitant = straitant;
		this.rc = rc;
		this.adresse = adresse;
		this.contact = contact;
		this.email = email;
		this.tel = tel;
		this.obs = obs;
		this.DCreation = DCreation;
		this.loginCreation = loginCreation;
		this.DModif = DModif;
		this.loginModif = loginModif;
		this.equipeResses = equipeResses;
	}

	@Id

	@Column(name = "ID_STRAITANT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdStraitant() {
		return this.idStraitant;
	}

	public void setIdStraitant(BigDecimal idStraitant) {
		this.idStraitant = idStraitant;
	}

	@Column(name = "STRAITANT", nullable = false, length = 100)
	public String getStraitant() {
		return this.straitant;
	}

	public void setStraitant(String straitant) {
		this.straitant = straitant;
	}

	@Column(name = "RC", length = 50)
	public String getRc() {
		return this.rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	@Column(name = "ADRESSE", length = 200)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "CONTACT", length = 100)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TEL", length = 20)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "OBS", length = 500)
	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_CREATION", length = 11)
	public Date getDCreation() {
		return this.DCreation;
	}

	public void setDCreation(Date DCreation) {
		this.DCreation = DCreation;
	}

	@Column(name = "LOGIN_CREATION", length = 20)
	public String getLoginCreation() {
		return this.loginCreation;
	}

	public void setLoginCreation(String loginCreation) {
		this.loginCreation = loginCreation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_MODIF", length = 11)
	public Date getDModif() {
		return this.DModif;
	}

	public void setDModif(Date DModif) {
		this.DModif = DModif;
	}

	@Column(name = "LOGIN_MODIF", length = 20)
	public String getLoginModif() {
		return this.loginModif;
	}

	public void setLoginModif(String loginModif) {
		this.loginModif = loginModif;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sousTraitant")
	public Set<EquipeRess> getEquipeResses() {
		return this.equipeResses;
	}

	public void setEquipeResses(Set<EquipeRess> equipeResses) {
		this.equipeResses = equipeResses;
	}

}