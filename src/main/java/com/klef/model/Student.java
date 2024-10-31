package com.klef.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	private String id;
	private String name;
	private String department;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public Student(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student()
	{
		
	}
	
}
