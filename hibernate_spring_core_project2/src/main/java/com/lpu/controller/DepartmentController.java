package com.lpu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.lpu.config.Config;
import com.lpu.entity.Department;
import com.lpu.entity.Student;
import com.lpu.sevice.DepartmentService;
import com.lpu.sevice.StudentService;


@Component
public class DepartmentController {
	
	@Autowired
	private DepartmentService ds;
	
	@Autowired
	private StudentService ss;

	     public static void main(String args[]) {
	    	 
	    	       ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	    	       
	    	       DepartmentController dc=context.getBean("departmentController",DepartmentController.class);
	    	       
	    	        dc.helper();
	     }
	     
	     public void helper() {
	    	  
//	    		    Department d1=new Department("CSE");
//	    		    Department d2=new Department("ECE");
//	    		    Department d3=new Department("MEC");
//	    		    Department d4=new Department("CIVIL");

//	    		    Student s1=new Student("Ranga Raju","rangabattula455@gmail.com");
//	    		    Student s2=new Student("Rishith","rishith34@gmail.com");
//	    		    Student s3=new Student("poornima","poornima23@gmail.com");
//	    		    Student s4=new Student("udaya Sri","udayasri234@gmail.com");

//	    		    Student s5=new Student("Jotham Roy","roygroup420@gmail.com");
//	    		    Student s6=new Student("Sohel Khan","sohel999@gmail.com");
//	    		    Student s7=new Student("Anjan kumar saaho","anjansaaho333@gmail.com");
//	    		    Student s8=new Student("Vignan baratam","vignanbarat444@gmail.com");

//	    		    Student s9=new Student("Sai pavan","pavansai555@gmail.com");
//	    		    Student s10=new Student("Vamsi","vamsi666@gmail.com");
//	    		    Student s11=new Student("Swamy","swamy777@gmail.com");
//	    		    Student s12=new Student("Tanmay","tanmoy888@gmail.com");

//	    		    Student s13=new Student("Viswanth","viswanth222@gmail.com");
//	    		    Student s14=new Student("Sreenivas","srinivas111@gmail.com");
//	    		    Student s15=new Student("Lucky Singh","lucky000@gmail.com");
//	    		    Student s16=new Student("Anshul","anshul9999@gmail.com");

//	    		    d1.addStudents(Arrays.asList(s1,s2,s3,s4));
//	    		    d2.addStudents(Arrays.asList(s5,s6,s7,s8));
//	    		    d3.addStudents(Arrays.asList(s9,s10,s11,s12));
//	    		    d4.addStudents(Arrays.asList(s13,s14,s15,s16));

//	    		    ds.addDepartment(d1);
//	    		    ds.addDepartment(d2);
//	    		    ds.addDepartment(d3);
//	    		    ds.addDepartment(d4);
	    		
	    		    
	    		    Student s17=new Student("sandeep","sandy1221@gmail.com");
	    		    
	    		    
//	    		    ds.assignStudentToDepartment(1, s17);
//	    		    System.out.println("student assigned");
	    		    
//	    		     ss.deleteStudent(18);
	    		    
//	    		    Department dep1=ds.getDepartmentById(1);
//	    		    System.out.println(dep1);
	    		    
//	    		     ds.deleteDepartment(3);
	    		    
//	    		    List<Student> list= ds.view(1);
//	    		    System.out.println(list);
	    		     
//	    		     System.out.println(ss.readStudent(12));
	    		    
	    		    Student std1=ss.readStudent(3);
	    		    System.out.println(std1);
	    		    ds.deleteStudent(1, std1);
	    		    
	    	  
	    	  
	     }   
	    	 
	     }

