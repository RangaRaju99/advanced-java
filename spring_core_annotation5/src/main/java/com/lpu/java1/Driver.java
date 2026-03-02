package com.lpu.java1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java2.Person;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Person p=context.getBean("person",Person.class);
		Person p1=context.getBean("person",Person.class);
		System.out.println(p==p1);
		
		System.out.println(p);
		
		p.getF().getFruit();
		
		
				
	}
}
