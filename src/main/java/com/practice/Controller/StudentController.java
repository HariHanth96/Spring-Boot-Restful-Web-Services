package com.practice.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import com.practice.Model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Hari","Hanth");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Hari","Hanth"));
		students.add(new Student("Ramesh","Padu"));
		students.add(new Student("Vengai","Mavan"));
		students.add(new Student("Dinesh","Likna"));
		return students;
	}
	
	/*@PathVariable is an annotation used to extract values from the URI path 
	 * (URL segments) and bind them to method parameters in a controller.*/
	//@PathVariable("firstName") String fn,@PathVariable("lastName") String ln
	@GetMapping("/studentPV/{firstName}/{lastName}")
	public Student studentPathVaraiable(@PathVariable("firstName") String fn,@PathVariable("lastName") String ln) {
		return new Student(fn,ln);
	}
	
	@GetMapping("/studentRP")
	public Student studentRequestParam(@RequestParam("fn") String firstName,@RequestParam("ln") String lastName) {
		return new Student(firstName,lastName);
	}
}
