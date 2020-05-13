package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LocaliteMig generated by hbm2java
 */
@Entity
@Table(name = "LOCALITE_MIG", schema = "TOM")
public class LocaliteMig implements java.io.Serializable {

	private LocaliteMigId id;

	public LocaliteMig() {
	}

	public LocaliteMig(LocaliteMigId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "codeRegionSyratt", column = @Column(name = "CODE_REGION_SYRATT", length = 200)),
			@AttributeOverride(name = "region", column = @Column(name = "REGION", length = 200)),
			@AttributeOverride(name = "CDelegation", column = @Column(name = "C_DELEGATION", length = 200)),
			@AttributeOverride(name = "deleg", column = @Column(name = "DELEG", length = 200)),
			@AttributeOverride(name = "CLoc", column = @Column(name = "C_LOC", length = 200)),
			@AttributeOverride(name = "loc", column = @Column(name = "LOC", length = 200)),
			@AttributeOverride(name = "CPostal", column = @Column(name = "C_POSTAL", length = 200)),
			@AttributeOverride(name = "myaddressecode", column = @Column(name = "MYADDRESSECODE", length = 200)),
			@AttributeOverride(name = "myaddressenom", column = @Column(name = "MYADDRESSENOM", length = 200)) })
	public LocaliteMigId getId() {
		return this.id;
	}

	public void setId(LocaliteMigId id) {
		this.id = id;
	}

}
