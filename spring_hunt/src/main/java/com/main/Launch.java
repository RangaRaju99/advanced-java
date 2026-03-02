package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hunt.Employee;

public class Launch {

	public static void main(String args[]) {
		
		 //  ClassPathResource res=new ClassPathResource("bean.xml");
		//  BeanFactory context=new XmlBeanFactory(res);  // it is deprecated and removed in spring 5+ versions, so no longer in use
		
		    // this is IOC container
	     	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  // we can give the path of xml file,
// we can keep any name to xml file and here, we used ClassPthApplicationContext, so, it checks only in classpath, it means under src/main/java
// we can store, bean.xml in anywhere under class path here, like inside this src/main/java or src/main/resources, no problem/issue   	
	     	
	     	// Application context is eager-loading, that is why, object is created before context.getBean(), it means, at the time of ApplicationContext
	     	
	     	// id is case-sensitive, so make sure, both here, and in bean.xml, id should be same
	     	Employee emp=(Employee)context.getBean("emp"); // Here, In parameter, we need to pass, that id we created in bean.xml
	                            // context will return Object so, we need to down-cast it
	     	emp.test();
	
	}
}
