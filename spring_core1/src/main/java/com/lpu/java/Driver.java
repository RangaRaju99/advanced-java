package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lpu.java1.College;

public class Driver {

	public static void main(String args[]) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("main start");
		
//		Student std=context.getBean("myStudent",Student.class); // IOC
//		std.study();
//		
//		College clg=context.getBean("myCollege",College.class);
//		clg.admission();

		Student std=context.getBean("myStudent",Student.class); // IOC
		System.out.println(std.getId()+" ---  "+std.getName());
		 Laptop l1=std.getLaptop();
		 l1.start();
		 System.out.println(l1);
		
		
		
		System.out.println("main end");
	}
}
