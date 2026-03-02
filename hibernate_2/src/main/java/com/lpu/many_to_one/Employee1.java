//package com.lpu.many_to_one;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Employee1 {
//
//	@Id
//	private int emp_id;
//	private String name;
//	private double sal;
//	
//	@ManyToOne
//	private Company company;  
//	
//	public Employee1() {
//		
//	}
//	
//	
//
//	public Employee1(int emp_id, String name, double sal, Company company) {
//		super();
//		this.emp_id = emp_id;
//		this.name = name;
//		this.sal = sal;
//		this.company = company;
//	}
//
//
//
//	public int getEmp_id() {
//		return emp_id;
//	}
//
//	public void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getSal() {
//		return sal;
//	}
//
//	public void setSal(double sal) {
//		this.sal = sal;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//
//	
//	
//	
//}
