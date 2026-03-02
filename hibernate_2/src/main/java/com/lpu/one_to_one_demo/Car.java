//package com.lpu.one_to_one_demo;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Car {
//
//	@Id
//	private int id;
//	private String brand;
//	
//	@OneToOne
//	private Engine engine;
//
//	public Car() {
//
//	}
//	
//	public Car(int id, String brand, Engine engine) {
//		super();
//		this.id = id;
//		this.brand = brand;
//		this.engine = engine;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public Engine getEngine() {
//		return engine;
//	}
//
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//
//	@Override
//	public String toString() {
//		return "Car [id=" + id + ", brand=" + brand + ", engine=" + engine + "]";
//	}
//	
//
//}