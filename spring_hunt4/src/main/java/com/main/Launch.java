package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hunt.Employee;

public class Launch {

	public static void main(String args[]) {
		
		    // this is IOC container
	     	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  


	     	Employee emp1=(Employee)context.getBean("emp");
	     	System.out.println(emp1);
	
	}
}
