//package com.lpu.one_to_one_demo;
//
//import java.util.List;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.TypedQuery;
//
//public class EngineCrud {
//
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//	EntityManager em = emf.createEntityManager();
//	
//	public void  saveEngine(Engine e) {
//		EntityTransaction et = em.getTransaction();
//		
//		et.begin();
//		em.persist(e);
//		et.commit();
//		
//		System.out.println("Engine Saved");
//	}
//	
//	public void updateEngine(int id) {
//		EntityTransaction et = em.getTransaction();
//		
//		Engine e = em.find(Engine.class, id);
//		e.setCc(2044);
//		
//		et.begin();
//		em.merge(e);
//		et.commit();
//		
//		System.out.println("Engine Updated");
//	}
//	
//	public void deleteEngine(int id) {
//		EntityTransaction et = em.getTransaction();
//		
//		Engine e = em.find(Engine.class, id);
//		
//		et.begin();
//		em.remove(e);
//		et.commit();
//		
//		System.out.println("Engine Deleted");
//	}
//	
//	public void findEngine(int id) {
//		Engine e = em.find(Engine.class, id);
//		
//		System.out.println("Engine Found : " +e.getId() + " " + e.getCc());
//	}
//	
//	public void findAll() {
//		
//		    List<Engine> l= em.createQuery("select c from Car c",Engine.class).getResultList();
//			for(Engine c:l) {
//				System.out.println(l);
//			}
//	}
//}
