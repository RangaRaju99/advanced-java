package com.lpu.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lpu.java.Address1;
import com.lpu.java.Address2;

@Component
public class Employee2 {

	private int id;
	private String name;
	private Address2 address2;
	
	

	@Autowired
	public Employee2( @Value("4023")int id,@Value("rana") String name, Address2 address2) {
		super();
		this.id = id;
		this.name = name;
		this.address2 = address2;
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

	public Address2 getAddress2() {
		return address2;
	}

	@Autowired
	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address2=" + address2 + "]";
	}
	
	
     
	
}
