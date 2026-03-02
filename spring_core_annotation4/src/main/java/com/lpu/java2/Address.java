package com.lpu.java2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("ABN-Road")
	private String location;

	@Override
	public String toString() {
		return "Address [location=" + location + "]";
	}
	
	
}
