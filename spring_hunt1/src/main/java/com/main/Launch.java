package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hunt.Employee;

public class Launch {

	public static void main(String args[]) {
		
		    // this is IOC container
	     	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  // we can give the path of xml file,
// by default ApplicationContext is eager-loading, so if we want to make it to lazy-loading, add lazy-init="true" in bean.xml
	     
	     	// we enabled the lazy-init so before checking loading statement, no object creation
	     	 
	     	System.out.println("checking loading");
	     	
	     	Employee emp=(Employee)context.getBean("emp");  // after this line object creation happens

	     	
	     	emp.test();
	
	}
}
