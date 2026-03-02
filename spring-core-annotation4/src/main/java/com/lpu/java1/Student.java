package com.lpu.java1;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;


@Entity
public class Student {

	  @EmbeddedId
	  private StudentId studentId;
	  private String name;
	  private int age;
	  
	  @Embedded
	  private Address address;
	  
	  @ElementCollection
	  private List<String> subjectist=new ArrayList<>();
	  
	  
	  public Student() {
		  
	  }

	  @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", subjectist=" + subjectist + "]";
	}

	  public StudentId getStudentId() {
		  return studentId;
	  }

	  public void setStudentId(StudentId studentId) {
		  this.studentId = studentId;
	  }

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }

	  public int getAge() {
		  return age;
	  }

	  public void setAge(int age) {
		  this.age = age;
	  }

	  public Address getAddress() {
		  return address;
	  }

	  public void setAddress(Address address) {
		  this.address = address;
	  }

	  public List<String> getSubjectist() {
		  return subjectist;
	  }

	  public void setSubjectist(List<String> subjectist) {
		  this.subjectist = subjectist;
	  }
	  
	  
}
