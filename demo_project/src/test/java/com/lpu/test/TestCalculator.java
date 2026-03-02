package com.lpu.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.demo.Calculator;

public class TestCalculator {
	static Calculator c = null;
	
	@BeforeAll
	public static void CreateObject() {
		System.out.println("Unit test started");
		c = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = c.add(4, 5);
		
		Assertions.assertEquals(9, result);
	}
	
	@Test
	public void testMulti() {
		int result = c.multi(3, 4);
		
		Assertions.assertEquals(12, result);
	}
	
	@Test
	public void testSub() {
		int result = c.sub(6, 3);
		
		Assertions.assertEquals(3, result);
	}
	
	@Test
	public void testDiv() {
		int result = c.div(6, 2);
		
		Assertions.assertEquals(3, result);
	}
}

