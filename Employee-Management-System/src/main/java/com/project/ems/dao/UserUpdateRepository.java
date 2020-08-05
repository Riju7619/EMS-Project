package com.project.ems.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.ems.entity.User;

public interface UserUpdateRepository extends CrudRepository<User, Integer> {

}
