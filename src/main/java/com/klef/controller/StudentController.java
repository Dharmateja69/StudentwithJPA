package com.klef.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.klef.model.Student;
import com.klef.service.StudentService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class StudentController {
	@Autowired
	public StudentService studentservice;
	
	//Get List of Students
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentservice.getAllStudents();
	}
	
	
	//Get Student by Id
	@RequestMapping(value="/students/{id}", method=RequestMethod.GET)
	public Optional<Student> requestMethodName(@PathVariable String id) {
		return studentservice.getstudbyId(id);
	}
	
	////Add a Student(body sudent obj)
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public void addstudent(@RequestBody Student student) {
		 studentservice.addstudent(student);
	}
	//update student(id,student obj)
	@RequestMapping(value="/students/{id}", method=RequestMethod.PUT)
	public void Updatestudent(@RequestBody Student student, @PathVariable String id) {
		studentservice.updatestud(id, student);
	}
	//delete (id)
	@RequestMapping(value ="/students/{id}", method=RequestMethod.DELETE)
	public void Delete(@PathVariable String id) {
		studentservice.deletestud(id);
	}
	
	
	
	
	

}
