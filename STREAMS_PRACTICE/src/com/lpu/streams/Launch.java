package com.lpu.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;



public class Launch {

	  public static void main(String args[]) {
		  
		  // question-1
		  
		  List<String> l=new ArrayList<>(Arrays.asList("Raju","Rishi","poornima","udaya","sohel"));
		  
		  List<String> result=l.stream().filter(s->s.startsWith("R")).map(s->s.toUpperCase()).sorted().toList();
		  System.out.println(result);
		  
		  // question -2
		  
		  List<Integer> l1=List.of(1,2,3,4,5);
		  List<Integer> result1 = l1.stream().map(n->(n%2==0)?n*10:n).toList();
		  System.out.println(result1);
		  
		  // question -3
		  
		  List<String> l2= Arrays.asList("Raju","Rishi");
		  List<String> result2=l2.stream().map(s->s.toUpperCase()).sorted().toList();
		  System.out.println(result2);
		  
		  // question -4
		  
		  List<Integer> l3=List.of(12,3,54,6,8,9);
		      long result3=l3.stream().filter(n->n>7).count();
		      System.out.println(result3);
		      
		  // question -5
		      
		  List<String> l4=List.of("prabhas","ntr","rc","aa","vd");
		   String result4=l4.stream().reduce((a,b)->a+b).orElse(null);
		   System.out.println(result4);
		   
		  // question -6
		   
		   List<String> l5=List.of("kohili","sky","abd","rs","pandya","shami");
		   Optional<String> result5=l5.stream().filter(s->s.startsWith("s")).findFirst();
		   if(result5.isPresent()) {
			      System.out.println(result5.get());
		   }else {
			     System.out.println("no value");
		   }
		   
		 // question -7
		   
		   List<Integer> l6=List.of(12,34,12,4,3,6,2,6,4);
		   l6.stream().distinct().sorted().forEach(k->System.out.println(k));
		   
		 // question -8
		   
		   List<String> l7=List.of("raju","rishith","poornima","udaya");
		   String result7=l7.stream().max(Comparator.comparingInt(String::length)).orElse("no string");
		   System.out.println(result7);
		   
		    
		   
		  
		        
		  
	  }
}
