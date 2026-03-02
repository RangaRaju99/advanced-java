package com.lpu.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lpu.java.Address;

@Component(value="emp")
public class Employee {
	
/*    @Value is for:
          			✔ primitives
					✔ strings
					✔ properties file values
					✔ expressions
      	  It cannot create complex objects like:
												Address
												List
												Map
												Custom class
           For objects → use @Autowired.
*/
	
	@Value("123")  // only for passing
	private int id;
	
	@Value("raju")
	private String name;

	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
     
	
}
