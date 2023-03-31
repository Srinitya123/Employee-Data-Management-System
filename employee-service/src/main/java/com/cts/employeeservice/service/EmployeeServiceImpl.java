package com.cts.employeeservice.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employeeservice.Repository.EmployeeServiceRepository;
import com.cts.employeeservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeServiceRepository employeeServiceRepository;
	
	@Override
	public List<Employee> getEmployeeDetails() {
		
		List<Employee> emp=employeeServiceRepository.findAll();
		return emp;

	}

	@Override
	public void addEmployeeDetail(Employee emp) {
		employeeServiceRepository.save(emp);
		
	}

	@Override
	public Employee getEmployeeDetailById(int empid) {
		Employee emp=employeeServiceRepository.findById(empid);
		return emp;
	}
	

}
