package com.lpu.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student11 {

	@Id
	private int stu_id;
	private String name;
	private long phone;
	
	@JoinTable(name="stud_subj",
			joinColumns = {@JoinColumn(name="student_id_card")}
	,inverseJoinColumns= {@JoinColumn(name="subject_id_card")})
	@ManyToMany
	private List<Subject11> subjectList;
	
	public Student11() {
		
	}
	
	
	
}
