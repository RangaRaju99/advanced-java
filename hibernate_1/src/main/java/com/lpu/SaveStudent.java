package com.lpu;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveStudent {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		    Student s1=new Student(12,"poornima",7734215698L);
		    transaction.begin();
		    em.persist(s1);
		    System.out.println("Transaction done");
		    transaction.commit();  // after this statement only query executes, upto this statement all are in hold
		    
		     
	}
}
