package com.codeoj.entomologyapp.entitiesUsers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeoj.entomologyapp.utils.UserEntity;

@Entity
@Table(name = "student")
public class StudentEntity extends UserEntity {

	@Column(name = "career")
	private String career;

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
}
