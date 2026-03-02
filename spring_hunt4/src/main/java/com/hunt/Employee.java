package com.hunt;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	int id;
	String name;
	double salary;
	String expr;
	double result;
	
	
	Address address;
	Department department;
	
	List<String> jobs;
	Set<String> projects;
	Map<String,Integer> projectRatings;
	
	
	
	
	
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





	public double getSalary() {
		return salary;
	}





	public void setSalary(double salary) {
		this.salary = salary;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public List<String> getJobs() {
		return jobs;
	}





	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}





	public Set<String> getProjects() {
		return projects;
	}





	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}





	public Map<String, Integer> getProjectRatings() {
		return projectRatings;
	}





	public void setProjectRatings(Map<String, Integer> projectRatings) {
		this.projectRatings = projectRatings;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", jobs="
				+ jobs + ", projects=" + projects + ", projectRatings=" + projectRatings + "]";
	}
	
	
	
}
