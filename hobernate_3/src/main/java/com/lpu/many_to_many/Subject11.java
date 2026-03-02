package com.lpu.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject11 {

	@Id
	private int id;
	private String name;
	private String trainer;
	
	@ManyToMany(mappedBy="subjectList")
	private List<Student11> studentList;
	
	public Subject11() {
		
	}

	public Subject11(int id, String name, String trainer, List<Student11> studentList) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
		this.studentList = studentList;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Student11> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student11> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", trainer=" + trainer +  "]";
	}
	
	
}
