package com.lpu;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	  public static void main(String args[]) {
		  
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		  System.out.println(emf);
		  
		  EntityManager em=emf.createEntityManager();
		  System.out.println(em); 
		  
		  EntityTransaction transaction=em.getTransaction(); // for DML operations
		  
		 
		  
		  
		   
		  
		  
		  
		  
		  
		  
	  }
}
