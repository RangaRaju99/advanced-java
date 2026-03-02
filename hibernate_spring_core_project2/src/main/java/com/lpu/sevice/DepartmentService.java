package com.lpu.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lpu.dao.DepartmentCrud;
import com.lpu.entity.Department;
import com.lpu.entity.Student;


@Component
public class DepartmentService {

	   @Autowired
	   private DepartmentCrud dc;
	   
	   public void addDepartment(Department d) {
		     dc.addDepartment(d);
	   }
	   
	   public void assignStudentToDepartment(int deptId, Student student) {
		     dc.assignStudentToDepartment(deptId, student);
	   }
	   
	  
	   public Department getDepartmentById(int deptId) {
	   		
		   return dc.getDepartmentById(deptId);
	   	}

	 
	   	public List<Student> view(int deptId) {
	   		
	   		  return dc.viewStudentsByDepartmentId(deptId);
	   	}

	  
	   	public void deleteDepartment(int deptId) {
	   		
	   		dc.deleteDepartment(deptId);
	   		
	   	}
	   	
	   	public void deleteStudent(int id,Student student) {
	   		dc.deleteStudent(id, student);
	   	}

	  

}
