package com.cts.employeeservice.controller;

import java.util.List;
//import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employeeservice.model.Employee;
import com.cts.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@Validated
public class EmployeeServiceController {

	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/addemp")
	public ResponseEntity<String> addEmployee(@Valid @RequestBody Employee employee,BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return new ResponseEntity<>("Employee details not inserted",HttpStatus.OK);
		
		}employeeservice.addEmployeeDetail(employee);
		return new ResponseEntity<>("Employee details inserted",HttpStatus.OK);
	}
	
	@GetMapping("/allemp")
	public List<Employee> getAllEmployee()
	{
		return employeeservice.getEmployeeDetails();
	}
	
	@GetMapping("/getEmpById/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId)
	{
		return employeeservice.getEmployeeDetailById(employeeId);
	}
	
}
