package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.component.Employee;
import com.pack.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private  EmployeeDao empDao;
	
	public List<Employee> getAllEmployees(){
		return empDao.getAllEmployeeDao();
	}
	
}
