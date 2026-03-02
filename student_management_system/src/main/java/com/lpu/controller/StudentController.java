package com.lpu.controller;

import com.lpu.entity.Course;
import com.lpu.service.StudentService;

public class StudentController {

	private static StudentService service=new StudentService();
	
	    public static void main(String args[]) {
	    	
	    	     //  service.registerStudent("poornima", 21, 75.60);
	    	     // service.updateMarks(1, 67.8);
	    	
	    	     //  service.getStudent(1);
	    	
	    	     //   service.deleteStudent(1);
	    	
	    	  service.giveCourse(2, new Course("web","raju"));
	    	  
	    }
}
