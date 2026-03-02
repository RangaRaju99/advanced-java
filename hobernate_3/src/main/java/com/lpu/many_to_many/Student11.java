package com.lpu.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student11 {

	@Id
	private int id;
	private String name;
	private long phone;
	
	@ManyToMany
	private List<Subject11> subjectList;
	
	public Student11() {
		
	}
	
	public Student11(int id, String name, long phone, List<Subject11> subjectList) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.subjectList = subjectList;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Subject11> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject11> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone +" subjectList " +subjectList+"]";
	}
	
	
	
}
