package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/student")
	private List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

//creating a delete mapping that deletes a specific student  
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
		studentService.delete(id);
	}

//creating post mapping that post the student detail in the database  
	@PostMapping("/student")
	private int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getId();
	}
}
