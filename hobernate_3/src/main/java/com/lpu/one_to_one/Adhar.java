package com.lpu.one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {

	@Id
	private int id;
	private String location;
	
	@OneToOne(mappedBy="adhar") // it removes this column in Adhar table, and achieves bi-directionality
	private Person person;
	
	public Adhar() {
		
	}
	
	

	public Adhar(int id, String location, Person person) {
		super();
		this.id = id;
		this.location = location;
		this.person = person;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Adhar [id=" + id + ", location=" + location + ", person=" + person + "]";
	}
	
	
	
}
