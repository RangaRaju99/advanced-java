package com.lpu;

import com.entity.Student;

public interface StudentCrud {

	  void saveStudent(Student s);
	  
	  void updateStudentName(int is, String name);
	  
	  void updateStudentPhone(int id, long phone);
	  
	  void deleteStudent(int id);
	  
	  void findStudent(int id);
	  
	  void findAll();
}
