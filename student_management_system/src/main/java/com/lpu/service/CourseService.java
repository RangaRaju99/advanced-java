package com.lpu.service;

import com.lpu.dao.CourseDao;
import com.lpu.entity.Course;

public class CourseService {

 private CourseDao dao=new CourseDao();
	 
	 public Course registerCourse(String name,String trainer) {
		 
		 if(name.length()<=0 || name==null) {
			   throw new IllegalArgumentException("course name must not be empty");
		 }
		 if(trainer.length()<=0 || trainer==null) {
			   throw new IllegalArgumentException("trainer name must not be empty");
		 }
		 
		 Course c1=new Course(name,trainer);
		 return dao.saveCourse(c1);
		 
	 }
	 
	 public Course getCourse(int id) {
		   
		    Course c= dao.findCourseById(id);
		    if(c==null) {
		    	 throw new IllegalArgumentException("course not found");
		    }
		    return c;
	 }
	 
	 public void updateTrainer(int id, String trainer) {
		   
		   if(trainer.length()<=0 || trainer==null) {
			    throw new IllegalArgumentException("Invalid trainer");
		     }
		        dao.updateCourseTrainer(id, trainer);
	 }
	 
	 public void deleteCourse(int id) {
		     dao.deleteCourseById(id);
	 }
	 
	 
}
