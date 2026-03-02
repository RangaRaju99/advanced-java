package com.lpu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Cacheable
public class Department {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;  
	   private String name;
	  
	   @OneToMany(mappedBy="department", cascade= {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE},orphanRemoval=true)
	   private List<Student> students=new ArrayList<>();
	   
	   
	   public Department() {
		super();
	     }

	   public Department( String name) {
		super();
		
		this.name = name;
	   }

	   public void addStudent(Student std) {
		     students.add(std);
		     std.setDepartment(this);
	   }
	   
	   public void addStudents(List<Student> stds) {
		    
		     if(stds!=null) {
		      students.addAll(stds);
		      for(Student k:stds) {
		    	       addStudent(k);
		      }
		     }
	   }   
	   public void removeStudent(Student std) {
		      students.remove(std);
		      std.setDepartment(null);
	   }
	   public void removeStudents() {
		     for(Student k:students) {
		    	     k.setDepartment(null);
		     }
		     students.clear();
	   }
	  

	   public int getId() {
		   return id;
	   }

       public String getName() {
		   return name;
	   }


	   public void setName(String name) {
		   this.name = name;
	   }


	   public List<Student> getStudents() {
		   return students;
	   }


	   public void setStudents(List<Student> students) {
		   this.students = students;
	   }


	   @Override
	   public String toString() {
		return "Department [id=" + id + ", name=" + name + ", students=" + students + "]";
	   }
	   
	   
	   
	   
}
