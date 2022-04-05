package com.needine.spring2022.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.needine.spring2022.model.Employee;
import com.needine.spring2022.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){

		return employeeService.getAllEmployees();
	}
}



