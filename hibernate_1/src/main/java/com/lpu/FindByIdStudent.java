package com.lpu;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindByIdStudent {

	public static void main(String args[]) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		  
		     Student stud=em.find(Student.class,11);  // here, query writes, and gives data
		     System.out.println(stud);
		    System.out.println("Transaction done");
		   
		     
	}
}
