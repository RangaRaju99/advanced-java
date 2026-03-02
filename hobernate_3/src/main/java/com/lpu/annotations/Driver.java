package com.lpu.annotations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		   Book b1=new Book("java","sandeep",BookType.PYTHON);
		   
		   transaction.begin();
		   em.persist(b1);
		   transaction.commit();
	}
}
