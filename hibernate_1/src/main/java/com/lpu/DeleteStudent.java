package com.lpu;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteStudent {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		    Student s=em.find(Student.class,13);
		    
		    if(s != null) {

		        transaction.begin();
		        em.remove(s);
		        transaction.commit();

		        System.out.println("Student deleted");

		    } else {

		        System.out.println("Student not found");
		    }
		     
	}
}
