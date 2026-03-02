package com.hunt;

public class Employee {
	public int count=0;

	static {
		System.out.println("Employee bean loading");
	}
	Employee(){
		 System.out.println("Employee bean instantiating");
	}
	public void test() {
		System.out.println("Employee bean working");
		count++;
		System.out.println(count);  
	}
}
