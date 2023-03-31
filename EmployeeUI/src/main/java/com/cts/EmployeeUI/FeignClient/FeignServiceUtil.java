package com.cts.EmployeeUI.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.EmployeeUI.Model.Employee;


@FeignClient(value="client",url="http://localhost:8085/employee")
public interface FeignServiceUtil {
	
	@GetMapping("/allemp") 
	List<Employee> getAllEmployee();
	
	@PostMapping("/addemp")
	ResponseEntity<String> addEmployee(Employee employee);

}
