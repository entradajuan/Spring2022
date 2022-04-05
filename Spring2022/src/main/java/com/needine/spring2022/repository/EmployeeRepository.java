package com.needine.spring2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.needine.spring2022.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
