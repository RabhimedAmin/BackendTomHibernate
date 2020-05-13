package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.sql.Clob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SuiviMep generated by hbm2java
 */
@Entity
@Table(name = "SUIVI_MEP", schema = "TOM")
public class SuiviMep implements java.io.Serializable {

	private long versionMepId;
	private String versionMepLib;
	private Clob description;
	private Date dateDebut;
	private Date dateFin;

	public SuiviMep() {
	}

	public SuiviMep(long versionMepId, String versionMepLib, Clob description, Date dateDebut, Date dateFin) {
		this.versionMepId = versionMepId;
		this.versionMepLib = versionMepLib;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	@Id

	@Column(name = "VERSION_MEP_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getVersionMepId() {
		return this.versionMepId;
	}

	public void setVersionMepId(long versionMepId) {
		this.versionMepId = versionMepId;
	}

	@Column(name = "VERSION_MEP_LIB", nullable = false, length = 50)
	public String getVersionMepLib() {
		return this.versionMepLib;
	}

	public void setVersionMepLib(String versionMepLib) {
		this.versionMepLib = versionMepLib;
	}

	@Column(name = "DESCRIPTION", nullable = false)
	public Clob getDescription() {
		return this.description;
	}

	public void setDescription(Clob description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEBUT", nullable = false, length = 7)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN", nullable = false, length = 7)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
