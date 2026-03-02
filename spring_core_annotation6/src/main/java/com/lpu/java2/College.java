package com.lpu.java2;

public class College {
	

	private static final College c1=new College();
	

	private College() {
		
	}
	public static College getCollege() {
		return c1;	
	}
	

	
}

