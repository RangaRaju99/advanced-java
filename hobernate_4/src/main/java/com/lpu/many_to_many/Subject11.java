package com.lpu.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject11 {

	@Id
	private int sub_id;
	private String name;
	private String trainer;
	
	@ManyToMany(mappedBy="subjectList")
	private List<Student11> studentList;
	
	public Subject11() {
		
	}

	
}
