package com.lpu.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lpu.entity.Student;
import com.lpu.util.JpaUtil;

@Component
public class StudentCrudImpl implements StudentCrud{

	EntityManager em=JpaUtil.getManager();
	
	@Override
	public void addStudent(Student d) {
		
		EntityTransaction transaction=em.getTransaction();
		   transaction.begin();
		   em.persist(d);
		   transaction.commit();
		
	}

	@Override
	public void updateStudent(int studentId, String newEmail) {
		
		 Student s1=em.find(Student.class, studentId);
		  s1.setEmail(newEmail);
		  
		  EntityTransaction transaction=em.getTransaction();
		   transaction.begin();
		   em.merge(s1);
		   transaction.commit();
		
	}

	@Override
	public void deleteStudent(int studentId) {
		
		EntityTransaction transaction=em.getTransaction();
		   transaction.begin();
		   Student s1 = em.find(Student.class, studentId);
		    if (s1!=null) {
		        em.remove(s1);   
		    }
		   transaction.commit();
		
	}

	@Override
	public Student readStudent(int studentId) {
		 return em.find(Student.class, studentId);
	}

}
