package com.UST.employee.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.employee.demo.model.Employee;
import com.UST.employee.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public Employee createEmployee(Employee employee) {
		
		return repo.save(employee);
	}
}