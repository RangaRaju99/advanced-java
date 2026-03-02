package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

@Controller
public class MyController {

	@Autowired
	private EntityManagerFactory emf;
	
	   
	   @RequestMapping("/vs")
	   public String homePage() {
		   return "home";
	   }
	   
	   @RequestMapping("/registerPage")
	   public String openRegisterPage() {
	       return "register";
	   }
	   
	   
	   @RequestMapping("/save")
	   public String registerPage(@ModelAttribute Student std,Model model) {
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction tr=em.getTransaction();
		   tr.begin();
		   em.persist(std);
		   tr.commit();
		   model.addAttribute("student",std);
		   return "display";
	   }
	   
	   @RequestMapping("/fetch")
	   public String fetchById(@RequestParam("id") int id,Model model) {
		   EntityManager em=emf.createEntityManager();
		   Student std=em.find(Student.class,id);
		   model.addAttribute("student",std);
           return "display";
	   }
	   
	   @RequestMapping("/fetchPage")
	   public String fetch() {
		   return "fetch";
	   }
}
