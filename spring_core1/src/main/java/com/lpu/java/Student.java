package com.lpu.java;

public class Student {
	
	private int id;
	private String name;
	
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student() {
		
	}

	public Student(int id, String name,Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop=laptop;
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

	

	public void study() {
		System.out.println("student studying");
	}
}
