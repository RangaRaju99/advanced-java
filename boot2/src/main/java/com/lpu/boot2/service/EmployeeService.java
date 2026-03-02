package com.lpu.boot2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot2.entity.Employee;
import com.lpu.boot2.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmployee(Employee e) {
		 return repo.save(e);
	}
	
	public List<Employee> findAll(){
		  return repo.findAll();
	}
	
	public Employee findById(int id) {
		 return repo.findById(id).orElse(null);
	}
	
	public void deleteEmployeeById(int id) {
		  repo.deleteById(id);
	}
	
	public List<Employee> findByEmployeeName(String name) {
		 return repo.findByName(name);
	}
	
	public List<Employee> findByDepartmentName(String department){
		 return repo.findByDepartment(department);
	}
	
	public List<Employee> findByPhone(long phone) {
		 return repo.findByPhone(phone);
	}
	
	public List<Employee> findByEmailName(String email){
		 return repo.findByEmail(email);
	}
	
	public Employee getMaxSalary() {
		 return repo.getMaxSalary();
	}
	
	public Employee getMixSalary() {
		 return repo.getMinSalary();
	}
	
	public List<Employee> getRangeSalary(double min, double max){
		 return repo.findBySalary(min,max);
	}
	
	public List<Employee> getEmployee(double sal){
		  return repo.getEmployee(sal);
	}
	
	public void updateEmployee(int id, Employee e) {
		    Employee e1=repo.findById(id).orElse(null);
		    e1.setName(e.getName());
		    e1.setSalary(e.getSalary());
		    e1.setDepartment(e.getDepartment());
		    e1.setPhone(e.getPhone());
		    e1.setSalary(e.getSalary());
		    repo.save(e1);
	}
	
	public List<Employee> findBySalary(double min, double max){
		   return repo.findBySalary(min, max);
	}
	
	public Employee getMax() {
		   return repo.getMaxSalary();
	}
	
	public Employee getMin() {
		   return repo.getMinSalary();
	}
	

	
}
