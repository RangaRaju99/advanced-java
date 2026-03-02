package com.hunt;

public class Employee {
	
	private int id;  // here, we can give any name, naming convention in setter, doesn't effect the problem in bean creation
	private String name;
	
	
	
	public Employee() {  // only no-arg constructor
		
	}

	public int getEmpId() {
		return id;
	}
    public void setEmpId(int id) { 
		this.id = id;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String name) {
		this.name = name;
	}

	
//	public int getId() {
//		return empId;
//	}
//	public void setId(int emp_id) { // here, parameter naming convention in setter, doesn't effect the problem in bean creation
//		this.empId = emp_id;
//	}
//	public String getName() {
//		return empName;
//	}
//	public void setName(String emp_name) {
//		this.empName = emp_name;
//	}
	
	
	
	
	
}
