package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java1.Employee;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentClass std=context.getBean("studentClass",StudentClass.class);
		
		Employee e1=context.getBean("emp",Employee.class);
		e1.start();
		
		std.study();
	}
}
