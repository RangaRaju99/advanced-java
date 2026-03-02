//package com.lpu.one_to_one_demo;
//
//
//import java.util.List;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.Query;
//import jakarta.persistence.TypedQuery;
//
//	public class CarCrud{
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		
//		public void  saveCar(Car c) {
//			EntityTransaction et = em.getTransaction();
//			
//			et.begin();
//			em.persist(c);
//			et.commit();
//			
//			System.out.println("Car Saved");
//		}
//		
//		public void updateCar(int id) {
//			EntityTransaction et = em.getTransaction();
//			
//			Car c = em.find(Car.class, id);
//			c.setBrand("Kia");
//			
//			et.begin();
//			em.merge(c);
//			et.commit();
//			
//			System.out.println("Car Updated");
//		}
//		
//		public void deleteCar(int id) {
//			EntityTransaction et = em.getTransaction();
//			
//			Car c = em.find(Car.class, id);
//			
//			et.begin();
//			em.remove(c);
//			et.commit();
//			
//			System.out.println("Car Deleted");
//		}
//		
//		public void findCar(int id) {
//			Car c = em.find(Car.class, id);
//			
//			System.out.println("Car Found : " +c.getId() + " " + c.getBrand());
//		}
//		
//		public void findByBrand(String brand) {
//			
//			TypedQuery<Car> q=em.createQuery("select c from Car c where c.name:cName",Car.class);
//			q.setParameter("cName", brand);
//			List<Car> l=q.getResultList();
//			for(Car c:l) {
//				System.out.println(c);
//			}
//			
//		}
//		
//		public void findAll() {
//			
//			    List<Car> l= em.createQuery("select c from Car c",Car.class).getResultList();
//				for(Car c:l) {
//					System.out.println(l);
//				}
//		}
//	}
//	