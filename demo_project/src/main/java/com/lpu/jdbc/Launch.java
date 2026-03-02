package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch {
	
	    static Connection con=ConnectionFactory.getConnection();

	  public static void main(String args[]) {
		  
		 
		    	   
//		===========  INSERT OPERATION  ====================
		    	   
		           //   insert();
		    	   
		    	   
//	    ===========  UPDATE OPERATION  ====================

		    	   
		            //  update();
		    	   
		    	  
//	    ===========  DELETE OPERATION  ====================

		    	   
		    	    //  delete();
		           
		    	   
//	    ===========  READ OPERATION  ====================

		         
		             
		            System.out.println(read());
		            
//     ===========  READ OPERATION BY EMPLOYEE  ====================
		            
		            
		            System.out.println(read(12));
		     
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
	  public static String read() {
		  
		  String s="";
		  ResultSet rs=null;
		   try {
			  Statement stm=con.createStatement();
			   rs= stm.executeQuery("select * from employee;");
			   while(rs.next()) {
				   
				    int id=rs.getInt("id");
				    String name=rs.getString("name");
				    double sal =rs.getDouble("sal");
				    String email=rs.getString("email");
				    long phone=rs.getLong("phone");
				    
				    s= s+"ID : "+id+" \t||\tNAME : "+name+" \t||\tSALARY : "+sal+" \t||\tEMAIL : "+email+"\t||\tPHONE NUMBER : "+phone+"\n";
			   }
			    
			   
			   System.out.println("read operation done");
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   }  
		   
		   return s;
		    
	  }
	  
	  public static String read(int id1) {
		  
		     Statement stm=null;
		     String s="========================================== TABLE ==============================================================================\n";
		     ResultSet rs=null;
			 try {
				stm = con.createStatement();
				rs= stm.executeQuery("select * from employee where id = "+id1+";");
				while(rs.next()) {
					
					  int id=rs.getInt("id");
					    String name=rs.getString("name");
					    double sal =rs.getDouble("sal");
					    String email=rs.getString("email");
					    long phone=rs.getLong("phone");
					    
					    s= s+"ID : "+id+"\t\tNAME : "+name+"\t\tSALARY : "+sal+"\t\tEMAIL : "+email+"\t\tPHONE NUMBER : "+phone+"\n";
					    
				}
				
				System.out.println("read operation done");
			 } catch (SQLException e) {
				
				e.printStackTrace();
			 }
			 
			 return s;
		     
	  }
}
