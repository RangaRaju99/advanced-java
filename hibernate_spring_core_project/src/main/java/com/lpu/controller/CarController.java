package com.lpu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.config.Config;
import com.lpu.entity.Car;
import com.lpu.sevice.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CarController {
	
	  public static void main(String args[]) {
		  
		    ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		    
		    Service service=context.getBean("service",Service.class);
		    Car c=context.getBean("car",Car.class);
		    
		      EntityManagerFactory emf1= context.getBean(EntityManagerFactory.class);
		      System.out.println(emf1);
		      
		      EntityManager em1=context.getBean(EntityManager.class);
		      System.out.println(em1);
		      
		    
		   //  service.insertCar(c);	
		   //  service.updateCar(1,"FORD");
//		      Car c1= service.readCar(1);
//		      System.out.println(c1);
		    
		   //    service.deleteCar(2);
		       
		      
		    
		    
		    
	  }
}
