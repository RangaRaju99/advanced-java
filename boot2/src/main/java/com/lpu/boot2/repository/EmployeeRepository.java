package com.lpu.boot2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpu.boot2.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	  List<Employee> findByName(String name);
	  
	  List<Employee> findByDepartment(String department);
	  
	  @Query("select e from Employee e where phone=:phone")
	  List<Employee> findByPhone(long phone);
	  
	  @Query(nativeQuery=true, value="select * from employee where email=:email")
	  List<Employee> findByEmail(String email);
	  
	  @Query(nativeQuery=true, value="select * from employee where salary> :min and salary <= :max")
	  List<Employee> findBySalary(double min, double max);
	  
	  @Query(nativeQuery=true, value="select * from employee where salary=(select max(salary) from employee);")
	  Employee getMaxSalary();
	  
	  @Query(nativeQuery=true, value="select * from employee where salary=(select min(salary) from employee);")
	  Employee getMinSalary();
	  
	  @Query(nativeQuery=true, value="select * from employee where department='testing' and salary>:sal")
	  List<Employee> getEmployee(double sal);
	  
	  
	  
	  
	  
}
