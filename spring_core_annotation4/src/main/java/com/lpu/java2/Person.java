package com.lpu.java2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	  @Value("12")
	  private int id;
	  
	  @Value("raju")
	  private String name;
	  
	  @Autowired
	  private Address address;

	  @Override
	  public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	  }
	  
	  
	  
	  
}
