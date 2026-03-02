package com.lpu.java2;

import org.springframework.stereotype.Component;

@Component(value="mango")
public class Mango implements Fruit{

	@Override
	public void getFruit() {
	System.out.println("mango fruit");
		
	}

}
