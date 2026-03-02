package com.lpu.java1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.java2.Employee;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Employee emp=context.getBean("employee",Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getLocation());
		System.out.println(emp.getDepartment());
		
		  /*
1. All constructor parameters must be resolvable.
2. If a parameter lacks @Value and isn’t a bean → Spring fails.
3. Constructor injection happens before field/setter injection.
4. Fields not in constructor can be injected later.
5. Don’t mix constructor + field injection for same variable.
6. Mandatory dependencies → constructor.
7. Optional values → field/setter.
		 */
				
	}
}
