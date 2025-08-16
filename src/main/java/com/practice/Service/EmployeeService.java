package com.practice.Service;

import java.util.List;
import java.util.Optional;

import com.practice.Model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	List<Employee> findAllEmployee();
	
	Employee findEmployee(long id);
}
