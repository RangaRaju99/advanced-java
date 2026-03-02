package com.lpu.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lpu.dao.StudentCrud;
import com.lpu.entity.Student;


@Component
public class StudentService {

	
	   @Autowired
	   private StudentCrud sc;
	   
	   public void addStudent(Student d) {
			
		   sc.addStudent(d);
		}

		public void updateStudent(int studentId, String newEmail) {
			sc.updateStudent(studentId, newEmail);
			
		}

		public void deleteStudent(int studentId) {
		  sc.deleteStudent(studentId);
		}
		
		public Student readStudent(int StudentId) {
			 return sc.readStudent(StudentId);
		}

}
