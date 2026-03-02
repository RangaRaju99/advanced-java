package com.lpu.java2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="prototype")
public class Person {

	private int id;
	private String name;
	
	@Autowired
	@Qualifier(value="mango") // if, we comment it, we get @Primary value, if we keep both then @Qualifier value will get
	private Fruit f;
	
	

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



	public Fruit getF() {
		return f;
	}



	public void setF(Fruit f) {
		this.f = f;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", f=" + f + "]";
	}
	
	
}
