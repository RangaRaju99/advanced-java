package com.lpu;

import java.util.List;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Driver1 {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction transaction=em.getTransaction();
		   
		   Query query=em.createQuery("select s from Student s");
		   List<Student> list=query.getResultList();
		   
		   for(Student s:list) {
			    System.out.println(s);
		   }
		   
		   
	}
}
