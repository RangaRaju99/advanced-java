package com.lpu.boot3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot3.entity.Company;
import com.lpu.boot3.entity.Employee;
import com.lpu.boot3.exception.EmployeeNotFoundException;
import com.lpu.boot3.repository.CompanyRepository;
import com.lpu.boot3.repository.EmployeeRepository;


@Service
public class EmployeeService {

	 @Autowired
	private EmployeeRepository employeeRepo;
	 
	 public Employee saveEmployee(Employee e) {
		  return employeeRepo.save(e);
	 }
	 
	 public Employee findEmployee(int id) {
		    return employeeRepo.findById(id).orElseThrow(()->new EmployeeNotFoundException("No such employee exist"));
	 }
	 
	 public Employee updateEmployee(int id, Employee e) {
		   Employee e1= employeeRepo.findById(id).orElseThrow(()->new EmployeeNotFoundException("No such employee exist"));
		    
		   e1.setName(e.getName());
		   e1.setAge(e.getAge());
		   e1.setPhone(e.getPhone());
		   e1.setEmail(e.getEmail());
	   return employeeRepo.save(e1);
		   
	 }
	 
	 public void deleteEmployee(int id) {
		  employeeRepo.deleteById(id);
	 }
}
