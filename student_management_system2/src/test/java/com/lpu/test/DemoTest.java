package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.lpu.entity.Student;

public class DemoTest {
	
	
	@BeforeAll
	public static void m1() {
		System.out.println("before all");
	}

	
	@AfterAll
	public static void m2() {
		 System.out.println("after all");
	}
	
	@BeforeEach
	public void m3() {
		System.out.println("before each test method");
	}
	
	@AfterEach
	public void m4() {
		 System.out.println("after each test method");
	}
	
	
	@Test
	public void demo1() {
		 
		Assertions.assertEquals("xyz","xyz");
	}
	
	@Test
	public void demo2() {
		
		Assertions.assertNotNull(null,"null value is not allowed");
	}
	
	@Test
	public void demo3() {
		
		Assertions.assertThrows(ArithmeticException.class, ()->{
			int res=7/0;
		});
		
		}
	
	@Test
	  public void demo4() {
		   Assertions.assertDoesNotThrow(()->{
			   int res=9/0;
		   });
		      
	  }
	
	@Test
	  public void demo5() {
		  
		  Student s1=new Student();
		  Student s2=new Student();
		     
		  Assertions.assertSame(s1, s2);
	  }
	
	 @Test
	  public void demo6() {
		   
		    int age=17;
		    if(age<18) {
		    	Assertions.fail("age is invalid");
		    }
	  }
	 
	 @Test
	 public void demo7() {
		  
		   int arr1[]= {12,24};
		   int arr2[]= {12,24};
		   
		   Assertions.assertArrayEquals(arr1, arr2);
	 }
	
	 @Test
	 public void demo8() {
		 
		  boolean res=true;
		  Assertions.assertTrue(res);
	 }
	 
	 @Test
	 public void demo9() {
		 
		  boolean res=false;
		  Assertions.assertFalse(res);
	 }
	 
	 @ParameterizedTest 
	 @CsvSource({"2,3,2","2,3,6","10,33,43"})  // here, each one treat as seperate demo like demo10(), demo11(), demo12()
	 public void testAddition(int a, int b, int sum) {
		 
		 int res=a+b;
		 Assertions.assertEquals(res, sum);
		 
	 }
	
	
	
	
	
	
	
	}


