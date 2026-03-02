package com.lpu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    private long phone;
	    private String email;
	    
	    
	    
		public Employee() {
			super();
		}
		
		
		public int getId() {
			return id;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
		}
	    
	    
	    
}
