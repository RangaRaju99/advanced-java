package com.lpu.java1;

import java.io.Serializable;

import jakarta.persistence.Embeddable;



@Embeddable
public class StudentId {

	private long phone;
	private String email;
	
	public StudentId() {
		
	}
	
	public StudentId(long phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentId [phone=" + phone + ", email=" + email + "]";
	}
	
	
}
