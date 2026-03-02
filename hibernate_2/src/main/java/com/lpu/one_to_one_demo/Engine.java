//package com.lpu.one_to_one_demo;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Engine {
//
//	@Id
//	private int id;
//	private int cc;
//
//	public Engine() {
//
//	}
//	
//
//	public Engine(int id, int cc) {
//		super();
//		this.id = id;
//		this.cc = cc;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getCc() {
//		return cc;
//	}
//
//	public void setCc(int cc) {
//		this.cc = cc;
//	}
//
//	@Override
//	public String toString() {
//		return "Engine [id=" + id + ", cc=" + cc + "]";
//	}
//	
//}