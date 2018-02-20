package com.codeoj.entomologyapp.entitiesUsers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeoj.entomologyapp.utils.UserEntity;

@Entity
@Table(name = "functionary")
public class FunctionaryEntity extends UserEntity {

	@Column(name = "occupation")
	private String occupation;

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
