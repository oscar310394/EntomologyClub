package com.codeoj.entomologyapp.utils;

import java.util.Date;

public class Subphylum {

	private int id;
	private String subphylum;
	private String commonName;
	private String scientificName;
	private String description;
	private String habits;
	private String habitat;
	private String impactOnHumanity;
	private String color;
	private String bodySize;
	private boolean isDeleted;
	private Date insertDate;

	public Subphylum() {

	}

	public Subphylum(int id) {
		this.id = id;
	}

	public Subphylum(int id, String subphylum, String commonName, String scientificName, String description,
			String habits, String habitat, String impactOnHumanity, String color, String bodySize, boolean isDeleted,
			Date insertDate) {
		this.id = id;
		this.subphylum = subphylum;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubphylum() {
		return subphylum;
	}

	public void setSubphylum(String subphylum) {
		this.subphylum = subphylum;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getImpactOnHumanity() {
		return impactOnHumanity;
	}

	public void setImpactOnHumanity(String impactOnHumanity) {
		this.impactOnHumanity = impactOnHumanity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBodySize() {
		return bodySize;
	}

	public void setBodySize(String bodySize) {
		this.bodySize = bodySize;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Override
	public String toString() {
		return "Subphylum [id=" + id + ", subphylum=" + subphylum + ", commonName=" + commonName + ", scientificName="
				+ scientificName + ", description=" + description + ", habits=" + habits + ", habitat=" + habitat
				+ ", impactOnHumanity=" + impactOnHumanity + ", color=" + color + ", bodySize=" + bodySize
				+ ", isDeleted=" + isDeleted + ", insertDate=" + insertDate + "]";
	}

}
