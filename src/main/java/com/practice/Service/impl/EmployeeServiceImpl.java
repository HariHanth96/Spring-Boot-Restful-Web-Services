package com.practice.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Exception.ResourceNotFoundException;
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


	@Override
	public Employee findEmployee(long id) {
		Optional<Employee> employee=empRepo.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		throw new ResourceNotFoundException("Employee","Id",id);
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Optional<Employee> emp=empRepo.findById(id);
		if(emp.isPresent()) {
			emp.get().setFirstname(employee.getFirstname());
			emp.get().setLastname(employee.getLastname());
			emp.get().setEmail(employee.getEmail());
			empRepo.save(emp.get());
			return emp.get();
			
		}
		throw new ResourceNotFoundException("Employee","Id",id);
	}

}
