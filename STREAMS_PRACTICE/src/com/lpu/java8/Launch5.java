package com.lpu.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Launch5 {

	public static void main(String args[]) {
		 
		  byte arr1[]= {12,2,34,43};
		  Stream<Byte> s1=IntStream.range(0, arr1.length).mapToObj(i->(byte)arr1[i]);
	}
}
