package com.lpu.e_commerce;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int customer_id;
	private String name;
	private String email;
	private String address;
	
	// here, in this entity helper methods goes , customer-order relation
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	private List<Orders> ordersList;
	
	
}
