//package com.lpu.one_to_many;
//
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
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
//	@OneToMany
//	private List<Account> accountList;
//	
//	public Bank() {
//		
//	}
//
//	public int getBank_id() {
//		return bank_id;
//	}
//
//	public void setBank_id(int bank_id) {
//		this.bank_id = bank_id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public List<Account> getAccountList() {
//		return accountList;
//	}
//
//	public void setAccountList(List<Account> accountList) {
//		this.accountList = accountList;
//	}
//	
//	
//	
//	  
//}
