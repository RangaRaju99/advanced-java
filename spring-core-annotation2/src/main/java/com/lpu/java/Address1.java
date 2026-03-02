package com.lpu.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address1 {

	private String location;
	private String street;
	
	

	public String getLocation() {
		return location;
	}

	@Value("P.T circle")
	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreet() {
		return street;
	}

	@Value("CU")
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", street=" + street + "]";
	}
	
	
}
