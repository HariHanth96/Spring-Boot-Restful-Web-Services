package com.practice.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Model.Employee;
import com.practice.Repository.EmployeeRepository;
import com.practice.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}


	@Override
	public List<Employee> findAllEmployee() {
		return empRepo.findAll();
	}

}
