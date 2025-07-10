package com.testing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
