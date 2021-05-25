package com.kiran.springbootAwsDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.springbootAwsDB.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
