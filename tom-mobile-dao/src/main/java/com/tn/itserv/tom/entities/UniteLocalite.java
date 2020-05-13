package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:52:19 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UniteLocalite generated by hbm2java
 */
@Entity
@Table(name = "UNITE_LOCALITE", schema = "TOM")
public class UniteLocalite implements java.io.Serializable {

	private UniteLocaliteId id;

	public UniteLocalite() {
	}

	public UniteLocalite(UniteLocaliteId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "CLoc", column = @Column(name = "C_LOC", nullable = false, length = 10)),
			@AttributeOverride(name = "CUnite", column = @Column(name = "C_UNITE", nullable = false, length = 20)) })
	public UniteLocaliteId getId() {
		return this.id;
	}

	public void setId(UniteLocaliteId id) {
		this.id = id;
	}

}
