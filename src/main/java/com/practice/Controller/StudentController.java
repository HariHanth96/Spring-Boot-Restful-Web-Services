package com.practice.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
