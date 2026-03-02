//package com.lpu.one_to_one;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class Driver {
//
//	public static void main(String args[]) {
//		
//		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		 EntityManager em=emf.createEntityManager();
//		 EntityTransaction transaction=em.getTransaction();
//		 
////		   Person p1=new Person();
////		   p1.setId(10);
////		   p1.setName("Ramu");
////		   
////		   Adhar a1=new Adhar();
////		   a1.setId(101);
////		   a1.setLocation("India");
////		   
////		   p1.setAdhar(a1);
////		   a1.setPerson(p1);
//		   
////		   transaction.begin();
////		   em.persist(a1);
////		   em.persist(p1);
////		   transaction.commit();
//		   
////		   Person p1=em.find(Person.class,10);
////		   System.out.println(p1);
//		   
//	}
//}
