package com.lpu.e_commerce;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categories {

	@Id
	private int category_id;
	private String category_name;
	private String category_type;
	
	// here, in this entity , helper methods goes, categories-product relation
	@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
	private List<Products> prodCategoryList;
}
