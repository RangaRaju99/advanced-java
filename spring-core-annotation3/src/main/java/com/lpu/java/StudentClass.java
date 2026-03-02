package com.lpu.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // (value="myStudent")  // if we don't give value, then by default it takes class name and first letter should be small
public class StudentClass {

	@Value("101")
	private int id;
	
	@Value("ranga")
	private String name;
	
	  public void study() {
		    System.out.println("sleeping");
	  }
}
