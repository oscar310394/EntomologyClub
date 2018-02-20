package com.codeoj.entomologyapp.utils;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class SubphylumEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private int id;

	@Column(name = "commonName")
	private String commonName;

	@Column(name = "scientificName")
	private String scientificName;

	@Column(name = "description")
	private String description;

	@Column(name = "habits")
	private String habits;

	@Column(name = "habitat")
	private String habitat;

	@Column(name = "impactOnHumanity")
	private String impactOnHumanity;

	@Column(name = "color")
	private String color;

	@Column(name = "bodySize")
	private String bodySize;

	@Column(name = "isDeleted")
	private boolean isDeleted;

	@Column(name = "insertDate")
	private Date insertDate;

	public SubphylumEntity() {

	}

	public SubphylumEntity(int id) {
		this.id = id;
	}

	public SubphylumEntity(String commonName, String scientificName, String description, String habits,
			String habitat, String impactOnHumanity, String color, String bodySize, boolean isDeleted,
			Date insertDate) {
		this.commonName = commonName;
		this.scientificName = scientificName;
		this.description = description;
		this.habits = habits;
		this.habitat = habitat;
		this.impactOnHumanity = impactOnHumanity;
		this.color = color;
		this.bodySize = bodySize;
		this.isDeleted = isDeleted;
		this.insertDate = insertDate;
	}

	@Override
	public String toString() {
		return "SubphylumEntity [id=" + id + ", commonName=" + commonName + ", scientificName=" + scientificName
				+ ", description=" + description + ", habits=" + habits + ", habitat=" + habitat + ", impactOnHumanity="
				+ impactOnHumanity + ", color=" + color + ", bodySize=" + bodySize + ", isDeleted=" + isDeleted
				+ ", insertDate=" + insertDate + "]";
	}

}
