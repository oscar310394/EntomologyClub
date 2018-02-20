package com.codeoj.entomologyapp.utils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "firstSurname")
	private String firstSurname;

	@Column(name = "secondSurname")
	private String secondSurname;

	@Column(name = "phoneNumber")
	private int phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "isAdmi")
	private boolean isAdmi;

	public UserEntity() {

	}

	public UserEntity(int id) {
		this.id = id;
	}

	public UserEntity(String name, String firstSurname, String secondSurname, int phoneNumber, String email,
			String password, boolean isAdmi) {
		super();
		this.name = name;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.isAdmi = isAdmi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmi() {
		return isAdmi;
	}

	public void setAdmi(boolean isAdmi) {
		this.isAdmi = isAdmi;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", firstSurname=" + firstSurname + ", secondSurname="
				+ secondSurname + ", phoneNumber=" + phoneNumber + ", email=" + email + ", password=" + password
				+ ", isAdmi=" + isAdmi + "]";
	}

}
