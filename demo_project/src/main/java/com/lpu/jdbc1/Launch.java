package com.lpu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch {
	
	    static Connection con=ConnectionFactory.getConnection();

	  public static void main(String args[]) {
		  
		 
		    	   
		    	   // insert operation
		    	   
		        //   insert();
		    	   
		    	   
		    	   // update operation
		    	   
		        //  update();
		    	   
		    	   // delete operation
		    	   
		    	   
		          delete();
		           
		    	   // read operation
		           
		         //  read();
		     
	  }
	  
	  public static void insert() {
		  
		   try {
			  Statement stm=con.createStatement();
			   stm.execute("insert into employee values(14,'udaya',5000,'udaya@gmail.com',8677662432);");
			   System.out.println("insert operation done");
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   }  
		    
	  }
	  public static void update() {
		  
		   try {
			  Statement stm=con.createStatement();
			   stm.execute("update employee set sal=7000 where id=12");
			   System.out.println("update operation done");
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   }  
		    
	  }
	  public static void delete() {
		  
		   try {
			  Statement stm=con.createStatement();
			   stm.execute("delete from employee where id=13");
			   System.out.println("delete operation done");
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   }  
		    
	  }
//	  public static String read() {
//		  
//		   try {
//			  Statement stm=con.createStatement();
//			   stm.execute("insert into employee values(11,'raju',20000,'raju@gmail.com',9392382422');");
//			   System.out.println("insert operation done");
//		   } catch (SQLException e) {
//			
//			e.printStackTrace();
//		   }  
//		    
//	  }
}
