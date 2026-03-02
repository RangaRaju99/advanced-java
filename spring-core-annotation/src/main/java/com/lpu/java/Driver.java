package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java1.Student;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		 Student std=context.getBean("student",Student.class);
		 System.out.println(std);
	}
}
