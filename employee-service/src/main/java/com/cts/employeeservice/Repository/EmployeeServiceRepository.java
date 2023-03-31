package com.cts.employeeservice.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.employeeservice.model.Employee;

public interface EmployeeServiceRepository extends MongoRepository<Employee, Integer>{

	Employee findById(int employeeId);
	
}
