package com.cts.employeeservice.service;

import java.util.List;

import com.cts.employeeservice.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployeeDetails();
	public Employee getEmployeeDetailById(int employeeId);
	public void addEmployeeDetail(Employee employee);
	
}
