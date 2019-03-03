package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pack.component.Employee;
import com.pack.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getemployees",method=RequestMethod.GET)
	public List<Employee> getEmployee()
	{
		return empService.getAllEmployees();
	}
	
}
