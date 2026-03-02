package com.lpu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Car;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class CarCrudImpl implements CarCrud{

	@Autowired
	private EntityManager em;
	
	
	@Override
	public void insert(Car c) {
		
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(c);
		transaction.commit();
		
		
	}

	@Override
	public void update(int id,String brand) {
		
		 EntityTransaction transaction=em.getTransaction();
		 Car c1=em.find(Car.class,id);
		 transaction.begin();
		 c1.setBrand(brand);
		 em.merge(c1);
		 transaction.commit();
		
	}

	@Override
	public void delete(int id) {
		EntityTransaction transaction=em.getTransaction();
		Car c1=em.find(Car.class,id);
		transaction.begin();
		em.remove(c1);
		transaction.commit();
		
	}

	@Override
	public Car read(int id) {
		
		  return em.find(Car.class,id);
	}

}
