package com.lpu;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudent {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		    Student s=em.find(Student.class,10);
		    s.setName("Ranga"); // here, we are updating only one field, but, while update query time, 
		                        //it takes all the columns in SET and replace old values only, if we are not updating that columns
		    transaction.begin();
		    em.merge(s); 
		    System.out.println("Transaction done");
		    transaction.commit(); // here, update query writes
		    
		     
	}
}
