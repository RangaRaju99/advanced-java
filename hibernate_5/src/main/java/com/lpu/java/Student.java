package com.lpu.java;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	
	private String user;
	
	@Convert(converter=PasswordConverter.class)
	private String password;
	
	@Convert(converter=BooleanConverter.class)
	private boolean isMarried;
	
	

	public Student() {
		super();
	}

	public Student(int id, String user, String password, boolean isMarried) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.isMarried = isMarried;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", user=" + user + ", password=" + password + ", isMarried=" + isMarried + "]";
	}
	
	
}
