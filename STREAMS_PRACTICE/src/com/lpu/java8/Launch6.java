package com.lpu.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Launch6 {

	public static void main(String args[]) {
		
		  List<Integer> l=new ArrayList<>(Arrays.asList(12,3,43,5,93,43,2));
		//  l.add();
		  l.remove(1); // it removes the value present in index 1
		  System.out.println(l);
		  l.remove(Integer.valueOf(43));
		  
		  List<Integer> l1=new ArrayList<>(Arrays.asList(32,23,13,5,93,12));
		  l.addAll(l1);
		  System.out.println(l);
		  
		  l.add(6,999);
		  
		  l.removeAll(l1);
		  System.out.println(l);
		  
		  l.removeIf(k->k%2==0);
		  System.out.println(l);
		  
		  List<Integer> l2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		  List<Integer> l3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,6,2,1));
		  System.out.println(l2.containsAll(l3));
		  
		  Map m1=new HashMap();
		 // m1.
		  
		//  Set s=new HashSet();
		  
		  Stack<Integer> st=new Stack<>();
		  st.push(10);
		  System.out.println(st.contains(10));
		  
		 // Collections.
		  
		 // Arrays.
		  
		  LocalDate d1=LocalDate.parse("2025-10-05");
		 // d1.
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  


	}
}
