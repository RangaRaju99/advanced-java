package com.lpu.service;

import com.lpu.dao.StudentDao;
import com.lpu.entity.Course;
import com.lpu.entity.Student;

public class StudentService {

	 private StudentDao dao=new StudentDao();
	 
	 public Student registerStudent(String name, int age, double marks) {
		 
		 if(age<18 || age>100) {
			   throw new IllegalArgumentException("student must be 18");
		 }
		 if(marks<0 || marks>100) {
			   throw new IllegalArgumentException("Invalid marks");
		 }
		 
		 Student st1=new Student(name,age,marks);
		 return dao.saveStudent(st1);
		 
	 }
	 
	 public Student getStudent(int id) {
		   
		    Student s= dao.findStudentById(id);
		    if(s==null) {
		    	 throw new IllegalArgumentException("student not found");
		    }
		    return s;
	 }
	 
	 public void updateMarks(int id, double marks) {
		   
		   if(marks<0 || marks>100) {
			    throw new IllegalArgumentException("Invalid marks");
		     }
		        dao.updateStudentMarks(id, marks);
	 }
	 
	 public void deleteStudent(int id) {
		     dao.deleteStudentById(id);
	 }
	 
	 public void giveCourse(int id, Course c) {
		 
		   if(c==null) {
			    throw new IllegalArgumentException("no course found");
		   }
		   
		   dao.giveCourseToTheStudent(id, c);
	 }
}
