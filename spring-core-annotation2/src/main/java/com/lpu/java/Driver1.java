package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java1.Employee1;

public class Driver1 {

	public static void main(String args[]) {
		 
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee1 emp1=context.getBean("employee1",Employee1.class);
		//Address1 addr2=context.getBean("address1",Address1.class);
		
		System.out.println(emp1);
		
	}
}
