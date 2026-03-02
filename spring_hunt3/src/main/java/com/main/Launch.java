package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hunt.Employee;

public class Launch {

	public static void main(String args[]) {
		
		    // this is IOC container
	     	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  


	     	Employee emp=(Employee)context.getBean("emp");  
	     	Employee emp1=(Employee)context.getBean("employee"); 
	     	Employee emp2=(Employee)context.getBean("emplo");  
	     	Employee emp3=(Employee)context.getBean("Employee");  
	     	
          
	     	
	     	emp.test();  
	     	emp1.test(); 
	     	emp2.test(); 
	     	emp3.test();
	     	
	     	
	     	Employee emp4=(Employee)context.getBean("Emp");  
	     	Employee emp5=(Employee)context.getBean("EMployee"); 
	     	Employee emp6=(Employee)context.getBean("Emplo");  
	     	Employee emp7=(Employee)context.getBean("EMPloyee");  
	     	
          
	     	
	     	emp4.test();  
	     	emp5.test(); 
	     	emp6.test(); 
	     	emp7.test();
	
	}
}
