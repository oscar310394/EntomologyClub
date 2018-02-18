package com.codeoj.entomologyapp.objUsers;

public class StudentObj {

	private int id;
	private String nameStudent;
	private String firstSurname;
	private String secondSurname;
	private int phoneNumber;
	private String email;
	private String career;
	private String passwordStudent;
	private String repeatPasswordStudent;
	private boolean isAdmi;

	public StudentObj() {

	}

	public StudentObj(int id) {

		this.id = id;
	}

	public StudentObj(int id, String nameStudent, String firstSurname, String secondSurname, int phoneNumber,
			String email, String career, String passwordStudent, String repeatPasswordStudent, boolean isAdmi) {
		this.id = id;
		this.nameStudent = nameStudent;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.career = career;
		this.passwordStudent = passwordStudent;
		this.repeatPasswordStudent = repeatPasswordStudent;
		this.isAdmi = isAdmi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
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

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getPasswordStudent() {
		return passwordStudent;
	}

	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}

	public String getRepeatPasswordStudent() {
		return repeatPasswordStudent;
	}

	public void setRepeatPasswordStudent(String repeatPasswordStudent) {
		this.repeatPasswordStudent = repeatPasswordStudent;
	}

	public boolean isAdmi() {
		return isAdmi;
	}

	public void setAdmi(boolean isAdmi) {
		this.isAdmi = isAdmi;
	}

	@Override
	public String toString() {
		return "StudentObj [id=" + id + ", nameStudent=" + nameStudent + ", firstSurname=" + firstSurname
				+ ", secondSurname=" + secondSurname + ", phoneNumber=" + phoneNumber + ", email=" + email + ", career="
				+ career + ", passwordStudent=" + passwordStudent + ", repeatPasswordStudent=" + repeatPasswordStudent
				+ ", isAdmi=" + isAdmi + "]";
	}

}
