package com.lpu.java2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="apple")
@Primary
public class Apple implements Fruit{

	@Override
	public void getFruit() {
		System.out.println("apple fruit");
		
	}

}
