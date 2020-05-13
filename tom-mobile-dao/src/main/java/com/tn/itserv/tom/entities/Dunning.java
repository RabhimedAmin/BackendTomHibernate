package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dunning generated by hbm2java
 */
@Entity
@Table(name = "DUNNING", schema = "TOM")
public class Dunning implements java.io.Serializable {

	private BigDecimal idDunning;
	private Parc parc;
	private PrmDemEtat prmDemEtat;
	private Region region;
	private BigDecimal type;
	private String bpmUid;
	private Date DCreation;
	private Date DCloture;
	private String sysSrc;
	private Date DSrc;
	private String numLigne;
	private Boolean FXdsl;
	private String nomRg;
	private String nom;
	private String prenom;
	private String contact1;
	private String contact1Tel;
	private String contact1Fax;
	private String contact1Mail;
	private String contact2;
	private String contact2Tel;
	private String contact2Fax;
	private String contact2Mail;
	private String idOffre;
	private String offre;
	private BigDecimal idAdrInst;
	private String adrInst;
	private String adrInstX;
	private String adrInstY;
	private Date DEtat;
	private Set<DunningOt> dunningOts = new HashSet<DunningOt>(0);
	private Set<DunningProp> dunningProps = new HashSet<DunningProp>(0);

	public Dunning() {
	}

	public Dunning(BigDecimal idDunning, PrmDemEtat prmDemEtat, Region region, BigDecimal type, Date DCreation,
			String sysSrc, String numLigne, Date DEtat) {
		this.idDunning = idDunning;
		this.prmDemEtat = prmDemEtat;
		this.region = region;
		this.type = type;
		this.DCreation = DCreation;
		this.sysSrc = sysSrc;
		this.numLigne = numLigne;
		this.DEtat = DEtat;
	}

	public Dunning(BigDecimal idDunning, Parc parc, PrmDemEtat prmDemEtat, Region region, BigDecimal type,
			String bpmUid, Date DCreation, Date DCloture, String sysSrc, Date DSrc, String numLigne, Boolean FXdsl,
			String nomRg, String nom, String prenom, String contact1, String contact1Tel, String contact1Fax,
			String contact1Mail, String contact2, String contact2Tel, String contact2Fax, String contact2Mail,
			String idOffre, String offre, BigDecimal idAdrInst, String adrInst, String adrInstX, String adrInstY,
			Date DEtat, Set<DunningOt> dunningOts, Set<DunningProp> dunningProps) {
		this.idDunning = idDunning;
		this.parc = parc;
		this.prmDemEtat = prmDemEtat;
		this.region = region;
		this.type = type;
		this.bpmUid = bpmUid;
		this.DCreation = DCreation;
		this.DCloture = DCloture;
		this.sysSrc = sysSrc;
		this.DSrc = DSrc;
		this.numLigne = numLigne;
		this.FXdsl = FXdsl;
		this.nomRg = nomRg;
		this.nom = nom;
		this.prenom = prenom;
		this.contact1 = contact1;
		this.contact1Tel = contact1Tel;
		this.contact1Fax = contact1Fax;
		this.contact1Mail = contact1Mail;
		this.contact2 = contact2;
		this.contact2Tel = contact2Tel;
		this.contact2Fax = contact2Fax;
		this.contact2Mail = contact2Mail;
		this.idOffre = idOffre;
		this.offre = offre;
		this.idAdrInst = idAdrInst;
		this.adrInst = adrInst;
		this.adrInstX = adrInstX;
		this.adrInstY = adrInstY;
		this.DEtat = DEtat;
		this.dunningOts = dunningOts;
		this.dunningProps = dunningProps;
	}

	@Id

	@Column(name = "ID_DUNNING", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdDunning() {
		return this.idDunning;
	}

	public void setIdDunning(BigDecimal idDunning) {
		this.idDunning = idDunning;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PARC")
	public Parc getParc() {
		return this.parc;
	}

	public void setParc(Parc parc) {
		this.parc = parc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NO_ETAT", nullable = false)
	public PrmDemEtat getPrmDemEtat() {
		return this.prmDemEtat;
	}

	public void setPrmDemEtat(PrmDemEtat prmDemEtat) {
		this.prmDemEtat = prmDemEtat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_REGION", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "TYPE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

	@Column(name = "BPM_UID", length = 50)
	public String getBpmUid() {
		return this.bpmUid;
	}

	public void setBpmUid(String bpmUid) {
		this.bpmUid = bpmUid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_CREATION", nullable = false, length = 11)
	public Date getDCreation() {
		return this.DCreation;
	}

	public void setDCreation(Date DCreation) {
		this.DCreation = DCreation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_CLOTURE", length = 11)
	public Date getDCloture() {
		return this.DCloture;
	}

	public void setDCloture(Date DCloture) {
		this.DCloture = DCloture;
	}

	@Column(name = "SYS_SRC", nullable = false, length = 50)
	public String getSysSrc() {
		return this.sysSrc;
	}

	public void setSysSrc(String sysSrc) {
		this.sysSrc = sysSrc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "D_SRC", length = 7)
	public Date getDSrc() {
		return this.DSrc;
	}

	public void setDSrc(Date DSrc) {
		this.DSrc = DSrc;
	}

	@Column(name = "NUM_LIGNE", nullable = false, length = 20)
	public String getNumLigne() {
		return this.numLigne;
	}

	public void setNumLigne(String numLigne) {
		this.numLigne = numLigne;
	}

	@Column(name = "F_XDSL", precision = 1, scale = 0)
	public Boolean getFXdsl() {
		return this.FXdsl;
	}

	public void setFXdsl(Boolean FXdsl) {
		this.FXdsl = FXdsl;
	}

	@Column(name = "NOM_RG", length = 100)
	public String getNomRg() {
		return this.nomRg;
	}

	public void setNomRg(String nomRg) {
		this.nomRg = nomRg;
	}

	@Column(name = "NOM", length = 100)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PRENOM", length = 100)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "CONTACT_1", length = 200)
	public String getContact1() {
		return this.contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	@Column(name = "CONTACT_1_TEL", length = 50)
	public String getContact1Tel() {
		return this.contact1Tel;
	}

	public void setContact1Tel(String contact1Tel) {
		this.contact1Tel = contact1Tel;
	}

	@Column(name = "CONTACT_1_FAX", length = 50)
	public String getContact1Fax() {
		return this.contact1Fax;
	}

	public void setContact1Fax(String contact1Fax) {
		this.contact1Fax = contact1Fax;
	}

	@Column(name = "CONTACT_1_MAIL", length = 50)
	public String getContact1Mail() {
		return this.contact1Mail;
	}

	public void setContact1Mail(String contact1Mail) {
		this.contact1Mail = contact1Mail;
	}

	@Column(name = "CONTACT_2", length = 200)
	public String getContact2() {
		return this.contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	@Column(name = "CONTACT_2_TEL", length = 50)
	public String getContact2Tel() {
		return this.contact2Tel;
	}

	public void setContact2Tel(String contact2Tel) {
		this.contact2Tel = contact2Tel;
	}

	@Column(name = "CONTACT_2_FAX", length = 50)
	public String getContact2Fax() {
		return this.contact2Fax;
	}

	public void setContact2Fax(String contact2Fax) {
		this.contact2Fax = contact2Fax;
	}

	@Column(name = "CONTACT_2_MAIL", length = 50)
	public String getContact2Mail() {
		return this.contact2Mail;
	}

	public void setContact2Mail(String contact2Mail) {
		this.contact2Mail = contact2Mail;
	}

	@Column(name = "ID_OFFRE", length = 50)
	public String getIdOffre() {
		return this.idOffre;
	}

	public void setIdOffre(String idOffre) {
		this.idOffre = idOffre;
	}

	@Column(name = "OFFRE", length = 200)
	public String getOffre() {
		return this.offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	@Column(name = "ID_ADR_INST", precision = 22, scale = 0)
	public BigDecimal getIdAdrInst() {
		return this.idAdrInst;
	}

	public void setIdAdrInst(BigDecimal idAdrInst) {
		this.idAdrInst = idAdrInst;
	}

	@Column(name = "ADR_INST", length = 500)
	public String getAdrInst() {
		return this.adrInst;
	}

	public void setAdrInst(String adrInst) {
		this.adrInst = adrInst;
	}

	@Column(name = "ADR_INST_X", length = 20)
	public String getAdrInstX() {
		return this.adrInstX;
	}

	public void setAdrInstX(String adrInstX) {
		this.adrInstX = adrInstX;
	}

	@Column(name = "ADR_INST_Y", length = 20)
	public String getAdrInstY() {
		return this.adrInstY;
	}

	public void setAdrInstY(String adrInstY) {
		this.adrInstY = adrInstY;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "D_ETAT", nullable = false, length = 11)
	public Date getDEtat() {
		return this.DEtat;
	}

	public void setDEtat(Date DEtat) {
		this.DEtat = DEtat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dunning")
	public Set<DunningOt> getDunningOts() {
		return this.dunningOts;
	}

	public void setDunningOts(Set<DunningOt> dunningOts) {
		this.dunningOts = dunningOts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dunning")
	public Set<DunningProp> getDunningProps() {
		return this.dunningProps;
	}

	public void setDunningProps(Set<DunningProp> dunningProps) {
		this.dunningProps = dunningProps;
	}

}