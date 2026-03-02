package com.lpu.java2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	  @Value("101")
	  private int id;
	  
	  private String name;
	  private String location;
	  private String department;
	  
	  public Employee(@Value("ranga") String name, @Value("G.T.Road") String location) {
		  this.name=name;
		  this.location=location;
		  
	  }

	  public int getId() {
		  return id;
	  }

	  public void setId(int id) {
		  this.id = id;
	  }

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }

	  public String getLocation() {
		  return location;
	  }

	  public void setLocation(String location) {
		  this.location = location;
	  }

	  public String getDepartment() {
		  return department;
	  }

	  @Value("CSE")
	  public void setDepartment(String department) {
		  this.department = department;
	  }

	  @Override
	  public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", department=" + department + "]";
	  }
	  
	  
	  
	  
}
