package com.lpu.application;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String args[]) {
		
		List<Order> l=List.of(
			new Order(101,"Raju","winter wear",2000.0,"vizag","paid")	,
			new Order(102,"Rishith","summer wear",3000.0,"ongole","unpaid")	,
			new Order(103,"poornima","foot wear",4000.0,"tirupati","paid")	,
			new Order(104,"udaya","summer wear",50000.0,"guntur","paid")	,
			new Order(105,"anjan","foot wear",60000.0,"markapur","paid")	,
			new Order(106,"sohel","winter wear",7000.0,"vijayawada","unpaid")	,
			new Order(107,"jotham","foot wear",8000.0,"hyderabad","paid")	,
			new Order(108,"tanmay","summer wear",1000.0,"guntur","paid")	,
			new Order(109,"anshul","winter wear",9000.0,"jalandha","paid")	,
			new Order(111,"sandeep","foot wear",150000.0,"guntur","unpaid")
				
				);
		
		
		// 1) 
		  
		List<Order> res1=l.stream().filter((Order o)->o.getStatus().equals("paid")).toList();
		System.out.println(res1);
		
		// 2)
		
		long count=l.stream().count();
		System.out.println(count);
		
		// 3)
		
		double res=l.stream().mapToDouble((Order o)->o.getAmount()).reduce((a,b)->a+b).orElse(0.0);
		System.out.println(res);
		
		// 4) 
		
		 Order o2=l.stream().max(Comparator.comparingDouble(Order::getAmount)).orElse(null);
		 System.out.println(o2);
		 
		// 5) 
		 
		 Order o1=l.stream().sorted(Comparator.comparingDouble(Order::getAmount)).limit(1).findFirst().get();
		 System.out.println(o1);
		 
		// 7) 
		 
		   List<String> res2=l.stream().map(Order::getCustomerName).distinct().toList();
		   System.out.println(res2);
		   
		// 8) 
		   
		    List<Order> list = l.stream().filter( o->o.getAmount()>50000).toList();
		    System.out.println(list);
		    
		 // 9)
		    
		    List<Order> res3=l.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).toList();
		    System.out.println(res3);
		    
		// 10)    
		   
		    List<Order> res4=l.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).limit(3).toList();
		    System.out.println(res4);
		    
		 // 11) 
		    
		  Map<String, List<Order>> map=  l.stream().collect(Collectors.groupingBy(Order::getCategory));
		  System.out.println(map);
		  
		  // 12) 
		  
		  Map<String, Long> map1=l.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.counting()));
		  System.out.println(map1);
		  
		  // 13)
		  
		   Map<String, Double> map2=l.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.summingDouble(Order::getAmount)));
		   System.out.println(map2);
		   
		  // 14)
		   
		   Map<String, Order> map3 =
				    l.stream()
				     .collect(Collectors.groupingBy(
				         Order::getCategory,
				         Collectors.collectingAndThen(
				             Collectors.maxBy(
				                 Comparator.comparingDouble(Order::getAmount)
				             ),
				             opt -> opt.orElse(null)
				         )
				     ));
       		    System.out.println(map3);
       		    
       		    
       	  // 15) 
       		    
       		  Map<String, Double> map4=l.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.averagingDouble(Order::getAmount)));
   		   System.out.println(map4);
   		   
   		  // 16) 
   		   
   		      Map<String,Double> map5= l.stream().collect(Collectors.groupingBy(Order::getCity,Collectors.summingDouble(Order::getAmount)));
   		     
   		      double max=Double.MIN_VALUE;
   		      String city="";
   		      
   		      for(Map.Entry<String,Double> k:map5.entrySet()) {
   		    	  
   		    	  if(k.getValue()>max) {
   		    		  max=k.getValue();
   		    		  city=k.getKey();
   		    	  }
   		      }
   		      System.out.println(city);
   		      
   		    
   		   // 17)
   		      
   		     Map<Boolean,List<Order>> map6= l.stream().collect(Collectors.partitioningBy((Order o)->o.getStatus().equalsIgnoreCase("paid")));
   		     System.out.println(map6);
       		    
   		    // 18) 
   		     
   		     
       		    
		
	}
}
