//package com.lpu.many_to_one;
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
//		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		  EntityManager em=emf.createEntityManager();
//		  EntityTransaction transaction=em.getTransaction();
//		  
//		  Company c1=new Company(101,"capg","banglore");
//		  
//		  Employee1 e1=new Employee1(10,"anjan",30.00,c1);
//		  Employee1 e2=new Employee1(11,"daku",50.00,c1);
//		  
////		  transaction.begin();
////		  em.persist(c1);
////		  em.persist(e1);
////		  em.persist(e2);
////		  transaction.commit();
//		  
//		  Employee1 e11 = em.find(Employee1.class, 10);
//		  System.out.println(e11);
//		  
//	}
//}
