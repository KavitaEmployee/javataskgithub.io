package com.Arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arc.entity.Employee;
import com.Arc.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee saveData(Employee employee) {

		return repo.save(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}
	@Override
	public void deleteData(Employee employee) {
		
			repo.delete(employee);
	}
	@Override
	public Optional<Employee> getEmlpoyeeById(int id) {
		
		return repo.findById(id);
	}
}
