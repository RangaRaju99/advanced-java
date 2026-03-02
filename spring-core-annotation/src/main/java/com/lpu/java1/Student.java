package com.lpu.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	@Value("123")
	private int id;
	
	@Value("raju")
	private String name;
	
	@Value("98.45")
	private Double marks;
	
	private StudentId sid;
	
	
	@Autowired
	public Student(StudentId sid) {
		   this.sid=sid;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", sid=" + sid + "]";
	}
	
	

}
