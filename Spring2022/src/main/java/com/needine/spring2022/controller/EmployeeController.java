package com.needine.spring2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	
	public EmployeeController() {
		super();
		
	}
	
	@GetMapping
//	public List<Employee> getAllEmployees(){
	public String getAllEmployees(){
		return "Halo Malo!";
	}
}



