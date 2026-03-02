package com.lpu.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lpu.java.Address;
import com.lpu.java.Address1;

@Component
public class Employee1 {

	private int id;
	private String name;
	private Address1 address1;
	
	

	public int getId() {
		return id;
	}

	@Value("1234")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	 @Value("rishith")
	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress1() {
		return address1;
	}

	@Autowired
	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address1=" + address1 + "]";
	}
	
	
     
	
}
