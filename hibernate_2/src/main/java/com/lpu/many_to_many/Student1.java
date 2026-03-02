//package com.lpu.many_to_many;
//
//
//import java.util.*;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//
//@Entity
//public class Student1 {
//	@Id
//	private int stu_id;
//	private String name;
//	private long phone;
//	
//	@ManyToMany
//	List<Subject> sub = new ArrayList<>();
//
//	
//	public int getStu_id() {
//		return stu_id;
//	}
//
//
//	public void setStu_id(int stu_id) {
//		this.stu_id = stu_id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public long getPhone() {
//		return phone;
//	}
//
//
//	public void setPhone(long phone) {
//		this.phone = phone;
//	}
//
//
//	public List<Subject> getSub() {
//		return sub;
//	}
//
//
//	public void setSub(List<Subject> sub) {
//		this.sub = sub;
//	}
//
//
//	public Student1() {
//		super();
//	}
//	
//}