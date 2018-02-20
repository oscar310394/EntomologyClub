package com.codeoj.entomologyapp.servicesUsers;

import org.springframework.data.repository.CrudRepository;

import com.codeoj.entomologyapp.entitiesUsers.StudentEntity;

public interface StudentService extends CrudRepository<StudentEntity, Integer> {

}
