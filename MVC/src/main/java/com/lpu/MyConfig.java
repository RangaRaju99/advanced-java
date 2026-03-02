package com.lpu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages= {"com.lpu"})
public class MyConfig {
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;	
	}
	
	@Bean
	public EntityManagerFactory getEmf() {
		 return Persistence.createEntityManagerFactory("dev");
	}
	
	@Bean
	public EntityManager getEm(EntityManagerFactory emf) {
		  return emf.createEntityManager();
	}

}
