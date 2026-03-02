//package com.lpu.one_to_many;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.TypedQuery;
//
//public class Driver {
//
//	public static void main(String args[]) {
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction transaction=em.getTransaction();
//		
////		  List<Account> l=new ArrayList<>();
////
////		  Account a1=new Account(10,"Raju",1500.0);
////		  Account a2=new Account(11,"rishi",2000.0);
////		  Account a3=new Account(12,"ramu",2500.0);
////		  
////		    l.add(a1);
////		    l.add(a2);
////		    l.add(a3);
////		    
////		 Bank b1=new Bank(101,"SBI","Mohali",l);
////		 
//////		 transaction.begin();
//////		  em.persist(a1);
//////		  em.persist(a2);
//////		  em.persist(a3);
//////		  em.persist(b1);
//////		 transaction.commit();
////		  
//////		    TypedQuery<Bank> q=em.createQuery("select b from Bank b",Bank.class);
//////		    List<Bank> list=q.getResultList();
//////		    for(Bank b:list) {
//////		    	System.out.println(b);
//////		    }
////		         
////		    // specific Id
//////		    Bank b11=em.find(Bank.class,101);
//////		    System.out.println(b11);
////		    
////		 //   em.remove(a1);   // error
//		    
//	}
//}
