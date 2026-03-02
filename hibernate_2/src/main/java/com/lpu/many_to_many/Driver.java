//package com.lpu.many_to_many;
//
//import java.util.Arrays;
//import java.util.List;
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
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction transaction =em.getTransaction();
//		
////		Subject s1=new Subject(101,"java","ravi");
////		Subject s2=new Subject(102,"sql","vaishnav");
////		
////		List<Subject> l=Arrays.asList(s1,s2);
////		
////		Student1 st1=new Student1(10,"vamshi",709,l);
////		Student1 st2=new Student1(11,"srinivas",112,l);
////		
////		transaction.begin();
////		em.persist(s1);
////		em.persist(s2);
////		em.persist(st1);
////		em.persist(st2);
////		transaction.commit();
//		
//	}
//}
