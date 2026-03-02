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
////		 Adhar a=new Adhar();
////		 a.setId(111111);
////		 a.setLocation("japan");
////		 
////		 Person p=new Person();
////		 p.setRoll(3);
////		 p.setName("rishith");
////		 p.setAdhar(a);
////		 
////		 transaction.begin();
////		 em.persist(p);
////		 em.persist(a);
////		 System.out.println("done");
////		 transaction.commit();
//		
////		 Person p1=em.find(Person.class,2);
////		 System.out.println(p1);
////		 
////		 Adhar a1=p1.getAdhar();
////		 System.out.println(a1);
////		 
////		
////		      transaction.begin();
////		      em.remove(p1);
////		      em.remove(a1);	
////		      transaction.commit();
//		 
//		//   Person p1=em.find(Person.class,3);
//		  // System.out.println(p1);
//		      
//		 
//		 
//		 
//		 
//		 
//		 
//		 
//	}
//}
