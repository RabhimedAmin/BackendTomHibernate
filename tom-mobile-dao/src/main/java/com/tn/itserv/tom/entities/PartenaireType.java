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
 * PartenaireType generated by hbm2java
 */
@Entity
@Table(name = "PARTENAIRE_TYPE", schema = "TOM")
public class PartenaireType implements java.io.Serializable {

	private String CTypePart;
	private String typePart;
	private Set<Partenaire> partenaires = new HashSet<Partenaire>(0);

	public PartenaireType() {
	}

	public PartenaireType(String CTypePart, String typePart) {
		this.CTypePart = CTypePart;
		this.typePart = typePart;
	}

	public PartenaireType(String CTypePart, String typePart, Set<Partenaire> partenaires) {
		this.CTypePart = CTypePart;
		this.typePart = typePart;
		this.partenaires = partenaires;
	}

	@Id

	@Column(name = "C_TYPE_PART", unique = true, nullable = false, length = 20)
	public String getCTypePart() {
		return this.CTypePart;
	}

	public void setCTypePart(String CTypePart) {
		this.CTypePart = CTypePart;
	}

	@Column(name = "TYPE_PART", nullable = false, length = 100)
	public String getTypePart() {
		return this.typePart;
	}

	public void setTypePart(String typePart) {
		this.typePart = typePart;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partenaireType")
	public Set<Partenaire> getPartenaires() {
		return this.partenaires;
	}

	public void setPartenaires(Set<Partenaire> partenaires) {
		this.partenaires = partenaires;
	}

}