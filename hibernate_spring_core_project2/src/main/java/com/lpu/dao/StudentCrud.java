package com.lpu.dao;

import com.lpu.entity.Student;

public interface StudentCrud {

	 void addStudent(Student d);
	  
	  void updateStudent(int studentId,String newEmail);
	  
	  void deleteStudent(int studentId);
	  
	  Student readStudent(int studentId);
}
