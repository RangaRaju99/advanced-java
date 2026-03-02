//package com.lpu.one_to_one;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Person {
//
//	  @Id
//	   private int roll;
//	   private String name;
//	   
//	   @OneToOne(fetch= FetchType.EAGER)
//	   private Adhar adhar_govn;  // col_name is adhar_id  ==> adhar_id, here id is the key column of Adhar table
//
//	   public int getRoll() {
//		   return roll;
//	   }
//
//	   public void setRoll(int roll) {
//		   this.roll = roll;
//	   }
//
//	   public String getName() {
//		   return name;
//	   }
//
//	   public void setName(String name) {
//		   this.name = name;
//	   }
//
//	   public Adhar getAdhar_govn() {
//		   return adhar_govn;
//	   }
//
//	   public void setAdhar_govn(Adhar adhar_govn) {
//		   this.adhar_govn = adhar_govn;
//	   }
//
//	  
//	  
//}
