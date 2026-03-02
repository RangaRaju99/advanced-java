package com.lpu.dao;

import java.util.List;

import com.lpu.entity.Course;
import com.lpu.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CourseDao {

	 private EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    
     public Course saveCourse(Course c) {
    	 
    	  EntityManager em=emf.createEntityManager();
    	  EntityTransaction transaction=em.getTransaction();
    	  
    	  transaction.begin();
    	  em.persist(c);
    	  transaction.commit();
    	  em.close();
    	  return c;
    	 
     }
     
     public Course findCourseById(int id) {
    	  
    	  EntityManager em=emf.createEntityManager();
    	 
    	   Course c1= em.find(Course.class, id);
    	   em.close();
    	   
    	   return c1;

    	 }
     
     
     public void updateCourseTrainer(int id, String newTrainer) {
    	 
    	  EntityManager em=emf.createEntityManager();
    	  EntityTransaction transaction=em.getTransaction();
    	  
    	  Course c1=em.find(Course.class, id);
    	  

    	  transaction.begin();
    	  if(c1!=null) {
    	      c1.setTrainer(newTrainer);
    	      em.merge(c1);
    	  }
    	  transaction.commit();
    	  em.close();
     }
     
      public void deleteCourseById(int id) {
    	  
    	   EntityManager em=emf.createEntityManager();
    	   EntityTransaction transaction=em.getTransaction();
    	   
    	   Course c1=em.find(Course.class,id);
    	   
    	   transaction.begin();
    	   if(c1!=null) {
    		   em.remove(c1);
	    	  }
    	   transaction.commit();
    	   
    	   em.close();
      }
      
     
      
}
