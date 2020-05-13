package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OtProp generated by hbm2java
 */
@Entity
@Table(name = "OT_PROP", schema = "TOM")
public class OtProp implements java.io.Serializable {

	private OtPropId id;
	private Ot ot;
	private Propriete propriete;
	private String valeur;
	private String idValeur;
	private String comm;
	private Date DModif;
	private String loginModif;
	private Set<OtPropSuivi> otPropSuivis = new HashSet<OtPropSuivi>(0);

	public OtProp() {
	}

	public OtProp(OtPropId id, Ot ot, Propriete propriete) {
		this.id = id;
		this.ot = ot;
		this.propriete = propriete;
	}

	public OtProp(OtPropId id, Ot ot, Propriete propriete, String valeur, String idValeur, String comm, Date DModif,
			String loginModif, Set<OtPropSuivi> otPropSuivis) {
		this.id = id;
		this.ot = ot;
		this.propriete = propriete;
		this.valeur = valeur;
		this.idValeur = idValeur;
		this.comm = comm;
		this.DModif = DModif;
		this.loginModif = loginModif;
		this.otPropSuivis = otPropSuivis;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idDem", column = @Column(name = "ID_DEM", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "noOt", column = @Column(name = "NO_OT", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "CProp", column = @Column(name = "C_PROP", nullable = false, length = 50)),
			@AttributeOverride(name = "groupe", column = @Column(name = "GROUPE", nullable = false, length = 50)) })
	public OtPropId getId() {
		return this.id;
	}

	public void setId(OtPropId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ID_DEM", referencedColumnName = "ID_DEM", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NO_OT", referencedColumnName = "NO_OT", nullable = false, insertable = false, updatable = false) })
	public Ot getOt() {
		return this.ot;
	}

	public void setOt(Ot ot) {
		this.ot = ot;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_PROP", nullable = false, insertable = false, updatable = false)
	public Propriete getPropriete() {
		return this.propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	@Column(name = "VALEUR", length = 200)
	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Column(name = "ID_VALEUR", length = 100)
	public String getIdValeur() {
		return this.idValeur;
	}

	public void setIdValeur(String idValeur) {
		this.idValeur = idValeur;
	}

	@Column(name = "COMM", length = 500)
	public String getComm() {
		return this.comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "otProp")
	public Set<OtPropSuivi> getOtPropSuivis() {
		return this.otPropSuivis;
	}

	public void setOtPropSuivis(Set<OtPropSuivi> otPropSuivis) {
		this.otPropSuivis = otPropSuivis;
	}

}