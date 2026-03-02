package com.lpu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages={"com.lpu"})
public class Config {
	
	@Bean
	public EntityManagerFactory getManagerFactory() {
		return Persistence.createEntityManagerFactory("dev");
	}

	@Bean
	public EntityManager getManager(EntityManagerFactory emf) {
		     return emf.createEntityManager();
	}
	
	
	
	   
}
