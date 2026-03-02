package com.lpu.e_commerce;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Delivery {

	@Id
	private int delivery_id;
	private String type;
	private String status;
	
	// here, in this entity helper methods goes, delivery-order relation
	@OneToMany(mappedBy="delivery", cascade=CascadeType.ALL)
	private List<Orders> ordersDeliveryList;
	
}
