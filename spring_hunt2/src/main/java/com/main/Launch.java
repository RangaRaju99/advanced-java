package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hunt.Employee;

public class Launch {

	public static void main(String args[]) {
		
		    // this is IOC container
	     	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  
	     
	     	// by default scope is singleton, so single object is created for bean throughout the application
/*	     	
	     	Employee emp=(Employee)context.getBean("emp");  // after this line object creation happens
	     	Employee emp1=(Employee)context.getBean("emp");  // after this line object creation happens
          
	     	// see, here, if object is single, then no second time instantiation, and count variable is shared
	     	emp.test();  // count=1
	     	emp1.test(); // count=2
	     	
*/	     	System.out.println("checking");
          
// in prototype-case, there is no use of lazy-init, because, IOC contaoner can't know at eagerly, how many objects need to create,
// so in prototype case, always lazy, whether you put lazy-int="true" or lazy-init="false"
	     	
	     	Employee emp=(Employee)context.getBean("emp");  
	     	Employee emp1=(Employee)context.getBean("emp"); 
          
	     	// here, every time new object is created, and 2 times instantiation 
	     	emp.test();  // count=1
	     	emp1.test(); // count=1
	     	// count variable is separate for each object
	
	}
}
