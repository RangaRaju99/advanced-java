package com.lpu.e_commerce;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	 private int orderId;
	 private LocalDate orderDate;
	 
	 @JoinColumn(name="customer_orders")
	 @ManyToOne(fetch=FetchType.LAZY)
	 private Customer customer;
	 
	 @JoinColumn(name="delivery_orders")
	 @ManyToOne(fetch=FetchType.LAZY)
	 private Delivery delivery;
	 
	 
	 // here, in this entity helper methods goes, orders-product relation, here,usually, cascade is none, because relation is shared and independent
	 @JoinTable(name="product_order",
			 joinColumns= {@JoinColumn(name="order_id")},
			 inverseJoinColumns= {@JoinColumn(name="product_id")})
	 @ManyToMany(cascade= {CascadeType.MERGE,CascadeType.PERSIST})  
	 private List<Products> productList;
	 
}
