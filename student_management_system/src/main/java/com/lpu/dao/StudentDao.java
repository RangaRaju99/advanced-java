package com.lpu.dao;

import com.lpu.entity.Course;
import com.lpu.entity.Student;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {

	    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    
	     public Student saveStudent(Student s) {
	    	 
	    	  EntityManager em=emf.createEntityManager();
	    	  EntityTransaction transaction=em.getTransaction();
	    	  
	    	  transaction.begin();
	    	  em.persist(s);
	    	  transaction.commit();
	    	  em.close();
	    	  return s;
	    	 
	     }
	     
	     public Student findStudentById(int id) {
	    	  
	    	  EntityManager em=emf.createEntityManager();
	    	 
	    	   Student st1= em.find(Student.class, id);
	    	   em.close();
	    	   
	    	   return st1;

	    	 }
	     
	     
	     public void updateStudentMarks(int id, double newMarks) {
	    	 
	    	  EntityManager em=emf.createEntityManager();
	    	  EntityTransaction transaction=em.getTransaction();
	    	  
	    	  Student st1=findStudentById(id);
	    	  
	
	    	  transaction.begin();
	    	  if(st1!=null) {
	    	      st1.setMarks(newMarks);
	    	      em.merge(st1);
	    	  }
	    	  transaction.commit();
	    	  em.close();
	     }
	     
	      public void deleteStudentById(int id) {
	    	  
	    	   EntityManager em=emf.createEntityManager();
	    	   EntityTransaction transaction=em.getTransaction();
	    	   
	    	   Student st1=em.find(Student.class,id);
	    	   
	    	   transaction.begin();
	    	   if(st1!=null) {
	    		   em.remove(st1);
		    	  }
	    	   transaction.commit();
	    	   
	    	   em.close();
	      }
	      
	      public void giveCourseToTheStudent(int id, Course newCourse) {
	    	  
	    	  EntityManager em=emf.createEntityManager();
	    	  EntityTransaction transaction=em.getTransaction();
	    	  
	    	  Student s1=em.find(Student.class, id);
//	    	  List<Course> temp=s1.getCourses();
//	    	  temp.add(newCourse);
//	    	  s1.setCourses(temp);
	    	  s1.addCourse(newCourse);
	    	  transaction.begin();
	    	  em.persist(s1);
	    	  transaction.commit();
	    	  
	    	  em.close();
	    	  
	    	  
	      }
	     
}
