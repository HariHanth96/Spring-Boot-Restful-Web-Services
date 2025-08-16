package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Model.Employee;
import com.practice.Service.EmployeeService;

@RestController
@RequestMapping("/employees") //base url
public class EmployeeController {
	
	@Autowired
	private EmployeeService empServe;
	
	/* postMapping request bring some json value these values are mapped with employee object
	 * by @RequestBody as it converts the json into objects and maps them with employee object
	 */
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(empServe.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/showall")
	public List<Employee> getAllEmployee(){
		return empServe.findAllEmployee();
	}
}
