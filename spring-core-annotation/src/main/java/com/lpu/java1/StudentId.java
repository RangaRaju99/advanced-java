package com.lpu.java1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentId {

	
	@Value("1234")
	private int id;
	
	@Value("CSE")
	private String branch;
	
	@Value("phagwara")
	private String location;
	
	

	public StudentId() {
		super();
	}



	@Override
	public String toString() {
		return "StudentId [id=" + id + ", branch=" + branch + ", location=" + location + "]";
	}
	
	
}
