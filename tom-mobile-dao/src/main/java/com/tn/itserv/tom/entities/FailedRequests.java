package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FailedRequests generated by hbm2java
 */
@Entity
@Table(name = "FAILED_REQUESTS", schema = "TOM")
public class FailedRequests implements java.io.Serializable {

	private FailedRequestsId id;

	public FailedRequests() {
	}

	public FailedRequests(FailedRequestsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idRequest", column = @Column(name = "ID_REQUEST", precision = 22, scale = 0)),
			@AttributeOverride(name = "DRequest", column = @Column(name = "D_REQUEST", length = 11)),
			@AttributeOverride(name = "type", column = @Column(name = "TYPE", length = 3)),
			@AttributeOverride(name = "sens", column = @Column(name = "SENS", length = 3)),
			@AttributeOverride(name = "ws", column = @Column(name = "WS", length = 100)),
			@AttributeOverride(name = "methode", column = @Column(name = "METHODE", length = 100)),
			@AttributeOverride(name = "sysAppele", column = @Column(name = "SYS_APPELE", length = 50)),
			@AttributeOverride(name = "CRetour", column = @Column(name = "C_RETOUR", length = 20)),
			@AttributeOverride(name = "operation", column = @Column(name = "OPERATION", length = 50)),
			@AttributeOverride(name = "txtLog", column = @Column(name = "TXT_LOG")),
			@AttributeOverride(name = "request", column = @Column(name = "REQUEST")),
			@AttributeOverride(name = "response", column = @Column(name = "RESPONSE")),
			@AttributeOverride(name = "idDem", column = @Column(name = "ID_DEM", precision = 22, scale = 0)),
			@AttributeOverride(name = "bpmUid", column = @Column(name = "BPM_UID", length = 50)),
			@AttributeOverride(name = "refDemSrc", column = @Column(name = "REF_DEM_SRC", length = 100)) })
	public FailedRequestsId getId() {
		return this.id;
	}

	public void setId(FailedRequestsId id) {
		this.id = id;
	}

}
