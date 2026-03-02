package com.lpu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lpu.entity.Department;
import com.lpu.entity.Student;
import com.lpu.util.JpaUtil;




@Component
@Primary
public class DepartmentCrudImpl implements DepartmentCrud{

	  EntityManager em=JpaUtil.getManager();
	  
	@Override
	public void addDepartment(Department d) {
		
		 EntityTransaction transaction=em.getTransaction();
		   transaction.begin();
		   em.persist(d);
		   transaction.commit();
	}

	@Override
	public void assignStudentToDepartment(int deptId, Student student) {
        Department d1=em.find(Department.class, deptId);
        
		 EntityTransaction transaction=em.getTransaction();
		 transaction.begin();
		   if(d1!=null) {
		          d1.addStudent(student);
		          em.merge(d1);
		   }else {
			   System.out.println("There is no such department ID --"+deptId+" present in Database");
		   }
		 transaction.commit();
		
	}

	@Override
	public Department getDepartmentById(int deptId) {
		
		Department d1=em.find(Department.class,deptId);
		return d1;
	}

	@Override
	public List<Student> viewStudentsByDepartmentId(int deptId) {
		
		  Department d1=em.find(Department.class,deptId);
		  List<Student> l1=d1.getStudents();
		  return l1;
	}

	@Override
	public void deleteDepartment(int deptId) {
		
		EntityTransaction transaction=em.getTransaction();
		   transaction.begin();
		   Department d1 = em.find(Department.class, deptId);
		    if (d1!=null) {
		        em.remove(d1);  
		    }
		   transaction.commit();
		
	}

	@Override
	public void deleteStudent(int deptId,Student student) {
        Department d1=em.find(Department.class, deptId);

		 EntityTransaction transaction=em.getTransaction();
		 transaction.begin();
		   if(d1!=null) {
		      //   d1.removeStudent(student);
			      d1.removeStudent(student);
		          em.remove(student);
		   }else {
			   System.out.println("There is no such department ID --"+deptId+" present in Database");
		   }
		 transaction.commit();
		  
	}

}
