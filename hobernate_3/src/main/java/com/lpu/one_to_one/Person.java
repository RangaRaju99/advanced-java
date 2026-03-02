package com.lpu.one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Person {

	@Id
	  private int id;
	  private String name;
	  
	  @JoinColumn(name="adhar_id_col")  // this name displayed in Person table in database, and this annptation represents --> it keeps this column in this Table
	  @OneToOne
	  private Adhar adhar;
	  
	  public Person() {
		  
	  }

	  public Person(int id, String name, Adhar adhar) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
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

	  public Adhar getAdhar() {
		  return adhar;
	  }

	  public void setAdhar(Adhar adhar) {
		  this.adhar = adhar;
	  }

	  @Override
	  public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adhar=" + adhar + "]";
	  }
	  
	  
}
