package com.lpu.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Cacheable
public class Student {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String email;
	
	 @JoinColumn(name="department_student")
	 @ManyToOne(fetch=FetchType.LAZY)
	 private Department department;
	 
	 public Student() {
		super();
	  }
	 
	
	 public Student(String name, String email) {
		super();
		this.name = name;
     	this.email = email;	
	 }

	 public int getId() {
		 return id;
	 }
      public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
	 }

	 public Department getDepartment() {
		 return department;
	 }

	 public void setDepartment(Department department) {
		 this.department = department;
	 }

	 @Override
	 public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	 }
	 
	 
	 
}
