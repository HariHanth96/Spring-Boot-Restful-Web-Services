package com.practice.Service;

import java.util.List;

import com.practice.Model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	List<Employee> findAllEmployee();
}
