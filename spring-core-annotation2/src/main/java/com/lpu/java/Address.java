package com.lpu.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="addr")
public class Address {

	@Value("G.T.road")
	private String location;
	
	@Value("LPU")
	private String street;

	@Override
	public String toString() {
		return "Address [location=" + location + ", street=" + street + "]";
	}
	
	
}
