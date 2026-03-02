package com.lpu;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentCrudImpl implements StudentCrud{
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em= emf.createEntityManager();

	@Override
	public void saveStudent(Student s) {
		
		 EntityTransaction transaction=em.getTransaction();
		 transaction.begin();
		  em.persist(s);
		  System.out.println("INSERT transaction done");
		  transaction.commit();
		
	}

	@Override
	public void updateStudentName(int id, String name) {
		
		  EntityTransaction transaction=em.getTransaction();
		    Student st=em.find(Student.class, id);
		    st.setName(name);
		  transaction.begin();
		  em.merge(st);
		  System.out.println("UPDATE transaction done");
		  transaction.commit();
		
	}

	@Override
	public void updateStudentPhone(int id, long phone) {
		
		EntityTransaction transaction=em.getTransaction();
	    Student st=em.find(Student.class, id);
	    st.setPhone(phone);
	  transaction.begin();
	  em.merge(st);
	  System.out.println("UPDATE transaction done");
	  transaction.commit();
		
	}

	@Override
	public void deleteStudent(int id) {
		
		EntityTransaction transaction=em.getTransaction();
	    Student st=em.find(Student.class, id);
	    transaction.begin();
	    em.remove(st);
	    System.out.println("DELETE transaction done");
	    transaction.commit();
		
	}

	@Override
	public void findStudent(int id) {
		
	    Student st=em.find(Student.class, id);
	   System.out.println(st);
	   System.out.println("READ operation done");
	 
	}

	@Override
	public void findAll() {
		
		List<Student> list =
			    em.createQuery("FROM Employee", Student.class)
			      .getResultList();
		  for(Student s:list) {
			  System.out.println(list);
		  }
		
	}

	     
}
