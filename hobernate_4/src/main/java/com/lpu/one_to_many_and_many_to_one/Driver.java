//package com.lpu.one_to_many_and_many_to_one;
//
//import java.util.Arrays;
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
////		 Bank b1=new Bank();
////		 b1.setId(101);
////		 b1.setName("SBI");
////		 b1.setLocation("India");
////		 
////		 Account a1=new Account();
////		 a1.setId(10);
////		 a1.setName("Raju");
////		 a1.setBalance(150.00);
////		 
////		 Account a2=new Account();
////		 a2.setId(11);
////		 a2.setName("Ramu");
////		 a2.setBalance(200.00);
////		 
////		 b1.setAccounts(Arrays.asList(a1,a2));
////		 
////		 a1.setBank(b1);
////		 a2.setBank(b1);
////		 
////		 transaction.begin();
////		 em.persist(a1);
////		 em.persist(a2);
////		 em.persist(b1);
////		 transaction.commit();
//		 
//		 
//	}
//}
