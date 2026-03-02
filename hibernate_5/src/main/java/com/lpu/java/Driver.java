package com.lpu.java;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		   Student std1=new Student(12,"raju","2005",false);
		   Student std2=new Student(13,"kona","2004",true);
		   
		   transaction.begin();
		  // em.persist(std1);
		  // em.persist(std2);
		   transaction.commit();
		   
		   Student std3=em.find(Student.class,12);
		   System.out.println(std3);
		   
		   
	}
}
