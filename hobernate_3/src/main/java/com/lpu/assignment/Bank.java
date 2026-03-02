package com.lpu.assignment;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	int id;
	String name;
	String location;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Account> accounts;

	public Bank() {
		
	}
	
	
	public Bank(int id, String name, String location, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.accounts = accounts;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", location=" + location + ", accounts=" + accounts + "]";
	}
	
	
	
}
