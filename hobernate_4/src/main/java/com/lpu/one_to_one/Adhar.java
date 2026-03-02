//package com.lpu.one_to_one;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Adhar {
//
//	@Id
//	private int govt_id;
//	private String location;
//	
//	@OneToOne(mappedBy="govt_adhar") // it removes this column in Adhar table, and achieves bi-directionality
//	private Person nor_person;
//	
//	public Adhar() {
//		
//	}
//	
//	
//
//	
//	
//}
