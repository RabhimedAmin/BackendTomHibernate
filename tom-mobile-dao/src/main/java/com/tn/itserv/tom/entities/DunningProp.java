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
 * DunningProp generated by hbm2java
 */
@Entity
@Table(name = "DUNNING_PROP", schema = "TOM")
public class DunningProp implements java.io.Serializable {

	private DunningPropId id;
	private Dunning dunning;
	private Propriete propriete;
	private String valeur;
	private String idValeur;
	private Boolean enabled;
	private Date DModif;
	private String loginModif;

	public DunningProp() {
	}

	public DunningProp(DunningPropId id, Dunning dunning, Propriete propriete) {
		this.id = id;
		this.dunning = dunning;
		this.propriete = propriete;
	}

	public DunningProp(DunningPropId id, Dunning dunning, Propriete propriete, String valeur, String idValeur,
			Boolean enabled, Date DModif, String loginModif) {
		this.id = id;
		this.dunning = dunning;
		this.propriete = propriete;
		this.valeur = valeur;
		this.idValeur = idValeur;
		this.enabled = enabled;
		this.DModif = DModif;
		this.loginModif = loginModif;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idDunning", column = @Column(name = "ID_DUNNING", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "CProp", column = @Column(name = "C_PROP", nullable = false, length = 50)),
			@AttributeOverride(name = "groupe", column = @Column(name = "GROUPE", nullable = false, length = 50)) })
	public DunningPropId getId() {
		return this.id;
	}

	public void setId(DunningPropId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DUNNING", nullable = false, insertable = false, updatable = false)
	public Dunning getDunning() {
		return this.dunning;
	}

	public void setDunning(Dunning dunning) {
		this.dunning = dunning;
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

	@Column(name = "ENABLED", precision = 1, scale = 0)
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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

}
