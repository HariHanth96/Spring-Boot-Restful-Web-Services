package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@GetMapping("/show") //@RequestParam url is give like this: /show?id=1&id2=2
	public ResponseEntity<Employee> getEmployee(@RequestParam(name="id") long id){
		return new ResponseEntity<Employee>(empServe.findEmployee(id),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(name="id") long id,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(empServe.updateEmployee(employee,id),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable long id){
		empServe.deleteEmployee(id);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.FORBIDDEN);
	}
}
