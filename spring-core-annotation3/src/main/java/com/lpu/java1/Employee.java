package com.lpu.java1;

import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {

	public void start() {
		System.out.println("starting");
	}
}
