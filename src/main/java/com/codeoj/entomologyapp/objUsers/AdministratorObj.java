package com.codeoj.entomologyapp.objUsers;

public class AdministratorObj {
	private int id;
	private String nameAdministrator;
	private String firstSurname;
	private String secondSurname;
	private int phoneNumber;
	private String email;
	private String passwordAdministrator;
	private String repeatPasswordAdministrator;
	private boolean isAdmi;

	public AdministratorObj() {

	}

	public AdministratorObj(int id) {
		this.id = id;
	}

	public AdministratorObj(int id, String nameAdministrator, String firstSurname, String secondSurname,
			int phoneNumber, String email, String passwordAdministrator, String repeatPasswordAdministrator,
			boolean isAdmi) {
		this.id = id;
		this.nameAdministrator = nameAdministrator;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passwordAdministrator = passwordAdministrator;
		this.repeatPasswordAdministrator = repeatPasswordAdministrator;
		this.isAdmi = isAdmi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAdministrator() {
		return nameAdministrator;
	}

	public void setNameAdministrator(String nameAdministrator) {
		this.nameAdministrator = nameAdministrator;
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

	public String getPasswordAdministrator() {
		return passwordAdministrator;
	}

	public void setPasswordAdministrator(String passwordAdministrator) {
		this.passwordAdministrator = passwordAdministrator;
	}

	public String getRepeatPasswordAdministrator() {
		return repeatPasswordAdministrator;
	}

	public void setRepeatPasswordAdministrator(String repeatPasswordAdministrator) {
		this.repeatPasswordAdministrator = repeatPasswordAdministrator;
	}

	public boolean isAdmi() {
		return isAdmi;
	}

	public void setAdmi(boolean isAdmi) {
		this.isAdmi = isAdmi;
	}

	@Override
	public String toString() {
		return "AdministratorObj [id=" + id + ", nameAdministrator=" + nameAdministrator + ", firstSurname="
				+ firstSurname + ", secondSurname=" + secondSurname + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", passwordAdministrator=" + passwordAdministrator + ", repeatPasswordAdministrator="
				+ repeatPasswordAdministrator + ", isAdmi=" + isAdmi + "]";
	}

}
