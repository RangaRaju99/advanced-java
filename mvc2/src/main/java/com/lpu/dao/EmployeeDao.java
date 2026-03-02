package com.lpu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

@Component
public class EmployeeDao {

	@Autowired
	private EntityManagerFactory emf;
	
	public void saveEmployee(Employee e) {
		
		  EntityManager em=emf.createEntityManager();
		  EntityTransaction transaction=em.getTransaction();
		  transaction.begin();
		  em.persist(e);
		  transaction.commit();
		  
	}
	
	public void updateEmployee(Employee emp) {
		 
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.merge(emp);
		transaction.commit();
		
	}
	
	public void deleteEmployee(int id) {
		 
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee e=em.find(Employee.class,id);
		em.remove(e);
		transaction.commit();
		
	}
	
	public Employee findById(int id) {
		EntityManager em=emf.createEntityManager();
		 return em.find(Employee.class,id);
	}
	
	public List<Employee> findAll(){
		  EntityManager em=emf.createEntityManager();
		   List<Employee> list=em.createQuery("select e from Employee e",Employee.class).getResultList();
		   return list;
	}
	
}
