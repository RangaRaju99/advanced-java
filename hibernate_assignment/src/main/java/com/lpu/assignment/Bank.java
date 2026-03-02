package com.lpu.assignment;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Bank {

    @Id
    private int id;

    private String name;
    private String location;

 
    @OneToMany(
               cascade = {CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REMOVE},
               fetch = FetchType.LAZY)
    private List<Account> accounts;

    public Bank() {}

    public Bank(int id, String name, String location, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.accounts = accounts;
	}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<Account> getAccounts() { return accounts; }
   
    public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
    public String toString() {
        return "Bank [id=" + id + ", name=" + name + ", location=" + location +", accounts "+accounts+"]";
    }

	
}
