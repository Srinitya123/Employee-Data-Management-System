package com.cts.EmployeeUI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.EmployeeUI.FeignClient.FeignServiceUtil;
import com.cts.EmployeeUI.Model.Employee;

import java.util.List;

@RestController
@RequestMapping("/empui")
public class feignClientController {

	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/allempui")
	public List<Employee> getAllEmployeeUI()
	{
		return feignServiceUtil.getAllEmployee();
	}
	
	@PostMapping("/saveemp")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee)
	{
		return feignServiceUtil.addEmployee(employee);
	}
	
}
