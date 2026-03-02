package com.lpu.dao;

import java.util.List;

import com.lpu.entity.Department;
import com.lpu.entity.Student;

public interface DepartmentCrud {

	 void addDepartment(Department d);
	 
	 void assignStudentToDepartment(int deptId,Student student);
	 
	 Department getDepartmentById(int deptId);
	 
	 List<Student> viewStudentsByDepartmentId(int deptId);
	 
	 void deleteDepartment(int deptId);
	 
	 void deleteStudent(int deptId,Student student);
	  
}
