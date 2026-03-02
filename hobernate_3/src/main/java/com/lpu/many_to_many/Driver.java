package com.lpu.many_to_many;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		
		 Student11 st1=new Student11();
		 st1.setId(10);
		 st1.setName("ramu");
		 st1.setPhone(9392382432l);
//		 
		 Student11 st2=new Student11();
		 st2.setId(11);
		 st2.setName("raju");
		 st2.setPhone(9392383422l);
		 
		 Subject11 sub1=new Subject11();
		 sub1.setId(101);
		 sub1.setName("java");
		 sub1.setTrainer("ravi");
//		 
		 Subject11 sub2=new Subject11();
		 sub2.setId(102);
		 sub2.setName("sql");
		 sub2.setTrainer("vyshanv");
//		 
//		 st1.setSubjectList(Arrays.asList(sub1,sub2));
//		 st2.setSubjectList(Arrays.asList(sub1,sub2));
//		 
		 sub1.setStudentList(Arrays.asList(st1,st2));
		 sub2.setStudentList(Arrays.asList(st1,st2));
//		 
		 transaction.begin();
		 em.persist(st1);
		 em.persist(st2);
		 em.persist(sub1);
		 em.persist(sub2);
		 transaction.commit();
		 
		 //
		 
//		   Student s1=em.find(Student.class, 10);
//		   
//		   transaction.begin();
//		   
//		   List<Subject> l1=s1.getSubjectList();
//		   
//		    for(Subject k:l1) {
//		    	
//		    	 if(k.getTrainer().equalsIgnoreCase("Ravi")) {
//		    		 
//		    		   k.setTrainer("Sandeep");
//		    		   
//		    		   em.merge(k);
//		    	 }
//		    }
////		    em.merge(s1); 
//		    transaction.commit();
//		    
//		    Student s2=em.find(Student.class, 10);
//		    System.out.println(s2);
//		    
		 
		 
		 
	}
}
