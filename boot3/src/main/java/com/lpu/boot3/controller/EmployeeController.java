package com.lpu.boot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.boot3.entity.Employee;
import com.lpu.boot3.entity.User;
import com.lpu.boot3.service.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

@RestController
@RequestMapping("/api")
@Validated
public class EmployeeController {

	 @Autowired
	private EmployeeService employeeService;
	 
	 
	 @PostMapping("/employee")
	 public Employee saveEmployee(@Valid @RequestBody Employee e) {
		  // Using AllArgsConstructor
	        User user1 = new User(1L, "Ranga", 25);
	        System.out.println(user1);

	        // Using Setter
	        User user2 = new User();
	        user2.setId(2L);
	        user2.setName("Hacker");
	        user2.setAge(30);
	        System.out.println(user2.getName());

	        // Using Builder
	        User user3 = User.builder()
	                .id(3L)
	                .name("Builder User")
	                .age(22)
	                .build();

	        System.out.println(user3);
		     return employeeService.saveEmployee(e);
	 }
	 
	 @GetMapping("/employee/{id}")
	 public Employee findEmployee(@PathVariable @Positive int id) {
		    return employeeService.findEmployee(id);
	 }
	 
	 @PutMapping("/employee/{id}")
	 public Employee updateEmployee(@PathVariable @Positive int id, @Valid @RequestBody Employee e) {
		  return employeeService.updateEmployee(id, e);
	 }
	 
	 @DeleteMapping("/employee")
	 public String deleteEmployee(@RequestParam @Positive int id) {
		   employeeService.deleteEmployee(id);
		   return "data deleted";
	 }
	 
	   
}
