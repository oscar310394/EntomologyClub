package com.codeoj.entomologyapp.servicesUsers;

import org.springframework.data.repository.CrudRepository;

import com.codeoj.entomologyapp.entitiesUsers.AdministratorEntity;

public interface AdministratorService extends CrudRepository<AdministratorEntity, Integer> {

}
