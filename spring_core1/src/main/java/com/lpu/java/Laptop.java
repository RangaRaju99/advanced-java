package com.lpu.java;

public class Laptop {
	
	private int ip;
	private String name;
	

	public void start() {
		System.out.println("laptop");
	}


	@Override
	public String toString() {
		return "Laptop [ip=" + ip + ", name=" + name + "]";
	}
	
	
}
