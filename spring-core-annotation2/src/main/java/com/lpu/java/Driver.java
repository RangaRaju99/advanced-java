package com.lpu.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java1.Employee;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee emp=context.getBean("emp",Employee.class);
		//Address addr=context.getBean("addr",Address.class);  // no need of this, when we use @Autowired of this object in any class
		System.out.println(emp);
	}
}
