package com.UST.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.employee.demo.model.Employee;
import com.UST.employee.demo.service.EmployeeService;




@RestController
@RequestMapping("/emp/registration")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/addemps")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	

}
