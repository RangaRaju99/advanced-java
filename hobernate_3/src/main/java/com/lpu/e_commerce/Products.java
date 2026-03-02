package com.lpu.e_commerce;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	 private int product_id;
	 private String product_name;
	 
	 @JoinColumn(name="product_category")
	 @ManyToOne(fetch=FetchType.LAZY)
	 private Categories category;
	 
	 @ManyToMany(mappedBy="productList")
	 private List<Orders> orderList;
	 
	 
}
