package com.lpu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stud {

	@Id
	private int id;
	private String name;
	
	public Stud() {
		
	}
	
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
