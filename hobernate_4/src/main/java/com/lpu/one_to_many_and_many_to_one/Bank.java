//package com.lpu.one_to_many_and_many_to_one;
//
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Bank {
//
//	@Id
//	private int bank_id;
//	private String name;
//	private String location;
//	
//	
//	@OneToMany(mappedBy="nor_bank")
//	private List<Account> accountsList;
//	
//	public Bank() {
//		
//	}
//
//	
//}
