package com.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 implements Serializable{

	@Id
	private int roll;
	private String name;
	
//	public Student1() {
//		
//		
//	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
}

