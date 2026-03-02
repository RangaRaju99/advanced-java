package com.hunt;

public class Employee {
	
	private int id;
	private String name;
	
	// case-1 ---> If you don't write any constructor, any setter, then how can IOC creates object, no property, constructor in bean in xml
	//        --> If you don't write it, then by default compiler will give default constructor, using that constructor object creates
	
	// case-2 --> If you have no-arg constructor, no setters, no parameterized constructor, no property, constructor in bean in xml
	//        --> then it creates using that no-arg constructor
	
	
	// case-3 --> If you have only parameterized constructor, there is no no-arg constructor, no setter,no property, constructor in bean in xml
	//         here, there is no default constructor created by compiler, because we already have constructor  ==== error
	
	// case-4 --> same as case-4 , but this time we write constructor-arg inside bean  --> no error
	
	// case-5 --> same as case-4, we have constructor, and also we have setters, this time, but empty bean tag--> no constructor, property ===> error
	
	// case-6 --> same as case-5, but his time inside bean tag, we have property ===> error
	
	// case-7 --> same as case-6, we also have no-arg constructor
	
	
	public Employee(int id,String name) { // case-3
		this.id=id;
		this.name=name;
	}
	
	public Employee() { // case-7
		
	}

	static {
		System.out.println("Employee bean loading");
	}
//	Employee(){   // case-1
//		 System.out.println("Employee bean instantiating");
//	}
	public void test() {
		System.out.println("Employee bean working");
		 
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
	
	
	
}
