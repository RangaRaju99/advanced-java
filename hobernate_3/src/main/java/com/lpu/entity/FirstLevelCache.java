package com.lpu.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FirstLevelCache {

	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		
		Stud s1=new Stud(10,"raju");
		transaction.begin();
		//em.persist(s1);
		transaction.commit();
		
		  Stud s2=em.find(Stud.class, 10);
		  Stud s3=em.find(Stud.class, 10); // first level cache
	}
}
