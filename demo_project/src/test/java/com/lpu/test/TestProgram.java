package com.lpu.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lpu.demo.Launch;

public class TestProgram {

	
	@Test
	public void testPalindrome() {
		
		boolean res=Launch.pal("malayalam");
		Assertions.assertEquals(res,true);
		
	}
	
	@Test
	public void testPrime() {
		
		  boolean res= Launch.prime(4);
		  Assertions.assertEquals(res,false);
	}
	
	@Test
	public void testArmstrong() {
		  
		boolean res=Launch.armstrong(153);
		Assertions.assertEquals(res,true);
		
	}
	
	    
}
