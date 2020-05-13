package com.tn.itserv.tom.entities;
// Generated 13 mai 2020 � 05:42:52 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DunningPropId generated by hbm2java
 */
@Embeddable
public class DunningPropId implements java.io.Serializable {

	private int idDunning;
	private String CProp;
	private String groupe;

	public DunningPropId() {
	}

	public DunningPropId(int idDunning, String CProp, String groupe) {
		this.idDunning = idDunning;
		this.CProp = CProp;
		this.groupe = groupe;
	}

	@Column(name = "ID_DUNNING", nullable = false, precision = 6, scale = 0)
	public int getIdDunning() {
		return this.idDunning;
	}

	public void setIdDunning(int idDunning) {
		this.idDunning = idDunning;
	}

	@Column(name = "C_PROP", nullable = false, length = 50)
	public String getCProp() {
		return this.CProp;
	}

	public void setCProp(String CProp) {
		this.CProp = CProp;
	}

	@Column(name = "GROUPE", nullable = false, length = 50)
	public String getGroupe() {
		return this.groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DunningPropId))
			return false;
		DunningPropId castOther = (DunningPropId) other;

		return (this.getIdDunning() == castOther.getIdDunning())
				&& ((this.getCProp() == castOther.getCProp()) || (this.getCProp() != null
						&& castOther.getCProp() != null && this.getCProp().equals(castOther.getCProp())))
				&& ((this.getGroupe() == castOther.getGroupe()) || (this.getGroupe() != null
						&& castOther.getGroupe() != null && this.getGroupe().equals(castOther.getGroupe())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDunning();
		result = 37 * result + (getCProp() == null ? 0 : this.getCProp().hashCode());
		result = 37 * result + (getGroupe() == null ? 0 : this.getGroupe().hashCode());
		return result;
	}

}
