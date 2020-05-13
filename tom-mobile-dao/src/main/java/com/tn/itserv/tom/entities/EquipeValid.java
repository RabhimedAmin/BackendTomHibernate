package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:52:19 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EquipeValid generated by hbm2java
 */
@Entity
@Table(name = "EQUIPE_VALID", schema = "TOM")
public class EquipeValid implements java.io.Serializable {

	private EquipeValidId id;

	public EquipeValid() {
	}

	public EquipeValid(EquipeValidId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idEquipe", column = @Column(name = "ID_EQUIPE", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "login", column = @Column(name = "LOGIN", nullable = false, length = 20)) })
	public EquipeValidId getId() {
		return this.id;
	}

	public void setId(EquipeValidId id) {
		this.id = id;
	}

}
