package com.codeoj.entomologyapp.utils;

public abstract class User {

	private int id;
	private String name;
	private String firstSurname;
	private String secondSurname;
	private int phoneNumber;
	private String email;
	private String password;
	private String repeatPassword;
	private boolean isAdmi;
	
	public User() {

	}

	public User(int id) {
		this.id = id;
	}

	public User(String name, String firstSurname, String secondSurname, int phoneNumber, String email, String password,
			String repeatPassword, boolean isAdmi) {
		this.name = name;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.repeatPassword = repeatPassword;
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

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public boolean isAdmi() {
		return isAdmi;
	}

	public void setAdmi(boolean isAdmi) {
		this.isAdmi = isAdmi;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstSurname=" + firstSurname + ", secondSurname="
				+ secondSurname + ", phoneNumber=" + phoneNumber + ", email=" + email + ", password=" + password
				+ ", repeatPassword=" + repeatPassword + ", isAdmi=" + isAdmi + "]";
	}
	
	
	
	
	
	
	
}
