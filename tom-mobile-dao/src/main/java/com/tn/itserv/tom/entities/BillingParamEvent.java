package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BillingParamEvent generated by hbm2java
 */
@Entity
@Table(name = "BILLING_PARAM_EVENT", schema = "TOM")
public class BillingParamEvent implements java.io.Serializable {

	private String codeEvent;
	private BillingNatEvent billingNatEvent;
	private Operation operation;
	private Partenaire partenaire;
	private boolean FFacturable;
	private String creePar;
	private Date creeLe;
	private String modifiePar;
	private Date modifieLe;
	private boolean sysSource;
	private Set<Motif> motifs = new HashSet<Motif>(0);
	private Set<BillingEvent> billingEvents = new HashSet<BillingEvent>(0);

	public BillingParamEvent() {
	}

	public BillingParamEvent(String codeEvent, BillingNatEvent billingNatEvent, Partenaire partenaire,
			boolean FFacturable, String creePar, Date creeLe, boolean sysSource) {
		this.codeEvent = codeEvent;
		this.billingNatEvent = billingNatEvent;
		this.partenaire = partenaire;
		this.FFacturable = FFacturable;
		this.creePar = creePar;
		this.creeLe = creeLe;
		this.sysSource = sysSource;
	}

	public BillingParamEvent(String codeEvent, BillingNatEvent billingNatEvent, Operation operation,
			Partenaire partenaire, boolean FFacturable, String creePar, Date creeLe, String modifiePar, Date modifieLe,
			boolean sysSource, Set<Motif> motifs, Set<BillingEvent> billingEvents) {
		this.codeEvent = codeEvent;
		this.billingNatEvent = billingNatEvent;
		this.operation = operation;
		this.partenaire = partenaire;
		this.FFacturable = FFacturable;
		this.creePar = creePar;
		this.creeLe = creeLe;
		this.modifiePar = modifiePar;
		this.modifieLe = modifieLe;
		this.sysSource = sysSource;
		this.motifs = motifs;
		this.billingEvents = billingEvents;
	}

	@Id

	@Column(name = "CODE_EVENT", unique = true, nullable = false, length = 50)
	public String getCodeEvent() {
		return this.codeEvent;
	}

	public void setCodeEvent(String codeEvent) {
		this.codeEvent = codeEvent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_NAT_EVENT", nullable = false)
	public BillingNatEvent getBillingNatEvent() {
		return this.billingNatEvent;
	}

	public void setBillingNatEvent(BillingNatEvent billingNatEvent) {
		this.billingNatEvent = billingNatEvent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_OP")
	public Operation getOperation() {
		return this.operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_PART", nullable = false)
	public Partenaire getPartenaire() {
		return this.partenaire;
	}

	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}

	@Column(name = "F_FACTURABLE", nullable = false, precision = 1, scale = 0)
	public boolean isFFacturable() {
		return this.FFacturable;
	}

	public void setFFacturable(boolean FFacturable) {
		this.FFacturable = FFacturable;
	}

	@Column(name = "CREE_PAR", nullable = false, length = 100)
	public String getCreePar() {
		return this.creePar;
	}

	public void setCreePar(String creePar) {
		this.creePar = creePar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREE_LE", nullable = false, length = 7)
	public Date getCreeLe() {
		return this.creeLe;
	}

	public void setCreeLe(Date creeLe) {
		this.creeLe = creeLe;
	}

	@Column(name = "MODIFIE_PAR", length = 100)
	public String getModifiePar() {
		return this.modifiePar;
	}

	public void setModifiePar(String modifiePar) {
		this.modifiePar = modifiePar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIE_LE", length = 7)
	public Date getModifieLe() {
		return this.modifieLe;
	}

	public void setModifieLe(Date modifieLe) {
		this.modifieLe = modifieLe;
	}

	@Column(name = "SYS_SOURCE", nullable = false, precision = 1, scale = 0)
	public boolean isSysSource() {
		return this.sysSource;
	}

	public void setSysSource(boolean sysSource) {
		this.sysSource = sysSource;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "BILLING_PARAM_MOTIF", schema = "TOM", joinColumns = {
			@JoinColumn(name = "CODE_EVENT", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "C_MOTIF", nullable = false, updatable = false) })
	public Set<Motif> getMotifs() {
		return this.motifs;
	}

	public void setMotifs(Set<Motif> motifs) {
		this.motifs = motifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "billingParamEvent")
	public Set<BillingEvent> getBillingEvents() {
		return this.billingEvents;
	}

	public void setBillingEvents(Set<BillingEvent> billingEvents) {
		this.billingEvents = billingEvents;
	}

}
