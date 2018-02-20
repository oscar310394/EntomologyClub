package com.codeoj.entomologyapp.entitiesUsers;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeoj.entomologyapp.utils.UserEntity;

@Entity
@Table(name = "administrator")
public class AdministratorEntity extends UserEntity {

}
