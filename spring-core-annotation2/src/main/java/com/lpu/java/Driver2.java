package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java1.Employee1;
import com.lpu.java1.Employee2;

public class Driver2 {

	public static void main(String args[]) {
		 
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee2 emp2=context.getBean("employee2",Employee2.class);
		//Address2 addr2=context.getBean("address2",Address2.class);
		
		System.out.println(emp2);
		
	}
}
