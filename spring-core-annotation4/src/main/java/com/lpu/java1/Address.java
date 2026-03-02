package com.lpu.java1;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String pincode;
	private int houseNo;
	
	public Address(String city, String pincode, int houseNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.houseNo = houseNo;
	}
	public Address() {
		super();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", houseNo=" + houseNo + "]";
	}
	
	
	
	
}
