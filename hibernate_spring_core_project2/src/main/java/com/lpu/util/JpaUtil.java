package com.lpu.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	public static EntityManager getManager() {
		return emf.createEntityManager();
	}
}
