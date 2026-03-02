package com.lpu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lpu.dao.EmployeeDao;
import com.lpu.entity.Employee;

@Controller
public class EmployeeController {
	
	  @Autowired
	  private EmployeeDao dao;

	   @RequestMapping("/registerPage")
	    public String registerPage(Model model) {
		   model.addAttribute("employee",new Employee()); // 
	        return "register";
	    }

	    @RequestMapping("/save")
	    public String save(@ModelAttribute Employee employee) {
	        dao.saveEmployee(employee);
	        return "redirect:/displayAll";  // URL
	    }

	    @RequestMapping("/displayAll")
	    public String findAllEmployee(Model model) {
	        model.addAttribute("employees", dao.findAll());
	        return "displayAll"; // JSP page
	    }
	    
	    

	    @RequestMapping("/delete")
	    public String deleteEmployee(@RequestParam("id") int id) {
	         dao.deleteEmployee(id);
	        return "redirect:/displayAll";
	    }

	    @RequestMapping("/edit")
	    public String editEmployee(@RequestParam("id") int id, Model model) {
	        Employee emp = dao.findById(id);
	        model.addAttribute("employee", emp);
	        return "update";
	    }

	    @RequestMapping("/update")
	    public String updateEmployee(@ModelAttribute Employee employee) {
	        dao.updateEmployee(employee);
	        return "redirect:/displayAll";
	    }
	}
	    
		

