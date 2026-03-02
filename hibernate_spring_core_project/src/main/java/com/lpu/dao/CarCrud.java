package com.lpu.dao;


import com.lpu.entity.Car;


public interface CarCrud {

	  void insert(Car c);
	  
	  void update(int id,String brand);
	  
	  void delete(int id);
	  
	  Car read(int id);
	    
	  
}
