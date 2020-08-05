package com.project.ems.dao;


import org.springframework.data.repository.CrudRepository;

import com.project.ems.entity.Employee;

public interface EmployeeUpdateRepository extends CrudRepository<Employee, Integer>{

}
