package com.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  // 1st rule
public class Student implements Serializable { // --> for sending data over network implements Serializable --> 5th rule

	@Id  // -->  4th rule
	private int id;
	private String name;    // keeping private --> 3rd rule
	private long phone;
	
	public Student() { // No-arg constructor -->  2nd rule
		
	}
	
	public Student(int id, String name,long phone) {
		  this.id=id;
		  this.name=name;
		  this.phone=phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}                                         // for accessing private, defining getters/setters ---> 3rd rule
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override    // --> 6th rule
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
