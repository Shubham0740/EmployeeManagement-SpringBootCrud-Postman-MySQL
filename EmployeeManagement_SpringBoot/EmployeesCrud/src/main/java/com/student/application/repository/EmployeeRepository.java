package com.student.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.application.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
