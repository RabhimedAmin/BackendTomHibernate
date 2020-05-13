package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
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
 * FonctionProftype generated by hbm2java
 */
@Entity
@Table(name = "FONCTION_PROFTYPE", schema = "TOM")
public class FonctionProftype implements java.io.Serializable {

	private FonctionProftypeId id;
	private Fonction fonction;
	private ProfilType profilType;
	private BigDecimal ordre;

	public FonctionProftype() {
	}

	public FonctionProftype(FonctionProftypeId id, Fonction fonction, ProfilType profilType, BigDecimal ordre) {
		this.id = id;
		this.fonction = fonction;
		this.profilType = profilType;
		this.ordre = ordre;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "CTypeProfil", column = @Column(name = "C_TYPE_PROFIL", nullable = false, length = 20)),
			@AttributeOverride(name = "CFonction", column = @Column(name = "C_FONCTION", nullable = false, length = 20)) })
	public FonctionProftypeId getId() {
		return this.id;
	}

	public void setId(FonctionProftypeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_FONCTION", nullable = false, insertable = false, updatable = false)
	public Fonction getFonction() {
		return this.fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_TYPE_PROFIL", nullable = false, insertable = false, updatable = false)
	public ProfilType getProfilType() {
		return this.profilType;
	}

	public void setProfilType(ProfilType profilType) {
		this.profilType = profilType;
	}

	@Column(name = "ORDRE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getOrdre() {
		return this.ordre;
	}

	public void setOrdre(BigDecimal ordre) {
		this.ordre = ordre;
	}

}
