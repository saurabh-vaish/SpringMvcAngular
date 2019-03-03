package com.pack.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;
import com.pack.component.Employee;

@Repository
public class EmployeeDao {

	
	//method to ganerate employee record
	public List<Employee> getAllEmployeeDao(){
		
		
		// to ganerate fake employee details , its a 3rd party dependency 
		Faker faker = new Faker();
		
		// employee list
		List<Employee> emplist = new ArrayList<Employee>();
		
		for (int i = 100; i < 121 ; i++) {
			Employee e = new Employee();
			e.setId(i);
			e.setName(faker.name().fullName());
			e.setMobile(faker.phoneNumber().cellPhone());
			e.setAddress(faker.address().fullAddress());
			e.setCompanyLogo(faker.company().logo());
			
			emplist.add(e);
		}
		
		return emplist;
	}
	
}
