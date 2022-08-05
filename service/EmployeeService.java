package com.Arc.service;

import java.util.List;
import java.util.Optional;

import com.Arc.entity.Employee;

public interface EmployeeService {
	
     Employee saveData(Employee employee);
	
	List<Employee> getAllEmployee();
	
	void deleteData(Employee employee);
	
	Optional<Employee> getEmlpoyeeById(int id);

	
}


