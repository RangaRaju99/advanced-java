package com.hunt;

public class Employee {

	static {
		System.out.println("Employee bean loading");
	}
	Employee(){
		 System.out.println("Employee bean instantiating");
	}
	public void test() {
		System.out.println("Employee bean working");
	}
}
