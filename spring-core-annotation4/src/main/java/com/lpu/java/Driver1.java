package com.lpu.java;

import java.util.Arrays;
import java.util.List;

import com.lpu.java1.Address;
import com.lpu.java1.Student;
import com.lpu.java1.StudentId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver1{

	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		Student s1=new Student();
		StudentId stuId=new StudentId(939232345l,"raju45@gmail.com");
		s1.setStudentId(stuId);
		
		s1.setName("Ranga Raju");
		s1.setAge(20);
		
		Address addr=new Address();
		addr.setCity("markapur");
		addr.setPincode("523318");
		addr.setHouseNo(1234);
		
		s1.setAddress(addr);
		
		List<String> list=Arrays.asList("SQL","JAVA","PYTHON");
		
		s1.setSubjectist(list);
		
		System.out.println(s1);
		
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(s1);
		transaction.commit();
		
		
		
	}
}
