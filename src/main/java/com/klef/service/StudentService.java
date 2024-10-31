package com.klef.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model.Student;
import com.klef.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;
	
	//Get List of Students
	public List<Student> getAllStudents() {
		
	    List<Student> students = new ArrayList<>();
		
	    studentRepository.findAll()
	    .forEach(students::add);
		
	    return students;		
	}
	
	//Add a Student
	public void addstudent(Student student)
	{
		studentRepository.save(student);
	}
	
	//Get Student by Id
	public Optional<Student> getstudbyId(String id)
	{
		return studentRepository.findById(id);
	}
	//Update a Student
	public void updatestud(String id,Student student)
	{
		studentRepository.save(student);
	}
	//Delete a Student
	public void deletestud(String id)
	{
		studentRepository.deleteById(id);
	}
	
	

}
