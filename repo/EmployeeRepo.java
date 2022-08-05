package com.Arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arc.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
