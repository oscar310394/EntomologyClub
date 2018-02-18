package com.codeoj.entomologyapp.objUsers;

public class FunctionaryObj {

	private int id;
	private String nameFunctionary;
	private String firstSurname;
	private String secondSurname;
	private int phoneNumber;
	private String email;
	private String occupation;
	private String passwordFunctionary;
	private String repeatPasswordFunctionary;
	private boolean isAdmi;

	public FunctionaryObj() {

	}

	public FunctionaryObj(int id) {
		this.id = id;
	}

	public FunctionaryObj(int id, String nameFunctionary, String firstSurname, String secondSurname, int phoneNumber,
			String email, String occupation, String passwordFunctionary, String repeatPasswordFunctionary,
			boolean isAdmi) {
		this.id = id;
		this.nameFunctionary = nameFunctionary;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.occupation = occupation;
		this.passwordFunctionary = passwordFunctionary;
		this.repeatPasswordFunctionary = repeatPasswordFunctionary;
		this.isAdmi = isAdmi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameFunctionary() {
		return nameFunctionary;
	}

	public void setNameFunctionary(String nameFunctionary) {
		this.nameFunctionary = nameFunctionary;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPasswordFunctionary() {
		return passwordFunctionary;
	}

	public void setPasswordFunctionary(String passwordFunctionary) {
		this.passwordFunctionary = passwordFunctionary;
	}

	public String getRepeatPasswordFunctionary() {
		return repeatPasswordFunctionary;
	}

	public void setRepeatPasswordFunctionary(String repeatPasswordFunctionary) {
		this.repeatPasswordFunctionary = repeatPasswordFunctionary;
	}

	public boolean isAdmi() {
		return isAdmi;
	}

	public void setAdmi(boolean isAdmi) {
		this.isAdmi = isAdmi;
	}

	@Override
	public String toString() {
		return "FunctionaryObj [id=" + id + ", nameFunctionary=" + nameFunctionary + ", firstSurname=" + firstSurname
				+ ", secondSurname=" + secondSurname + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", occupation=" + occupation + ", passwordFunctionary=" + passwordFunctionary
				+ ", repeatPasswordFunctionary=" + repeatPasswordFunctionary + ", isAdmi=" + isAdmi + "]";
	}

}
