package com.needine.spring2022.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.needine.spring2022.model.Employee;
import com.needine.spring2022.repository.EmployeeRepository;
import com.needine.spring2022.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository; 


	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

}
