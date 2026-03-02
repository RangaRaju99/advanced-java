package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Launch1 {
	
	private static Connection con=ConnectionFactory.getConnection();
	static Scanner sc=new Scanner(System.in);

	public static void main(String args[]) {
		
//		  ===========  INSERT OPERATION  ====================
 	   
                      // insert();
		              // insert1();
 	   
 	   
//        ===========  UPDATE OPERATION  ====================

 	   
                      // update();
 	   
 	  
//       ===========  DELETE OPERATION  ====================

 	   
 	                 // delete();
        
 	   
//       ===========  READ OPERATION  ====================

      
          
                    // System.out.println(read());
         
//       ===========  READ OPERATION BY EMPLOYEE  ====================
         
         
                     System.out.println(readById());
		   
		     
	}
	
	 public static void insert() {
		 
		   PreparedStatement ps=null;
		     try {
		    	 
		    	   ps=con.prepareStatement("insert into employee values(?,?,?,?,?),(?,?,?,?,?);");
		    	   ps.setInt(1, 17);
		    	   ps.setString(2,"anjan");
		    	   ps.setDouble(3, 7500);
		    	   ps.setString(4,"anjan@gmail.com");
		    	   ps.setLong(5, 6745678902l);
		    	   
		    	   
		    	   ps.setInt(6, 16);
		    	   ps.setString(7,"sohel");
		    	   ps.setDouble(8, 4500);
		    	   ps.setString(9,"sohel@gmail.com");
		    	   ps.setLong(10, 9845678902l);
		    	   
		    	   ps.execute();
		    	   
		    	   System.out.println("insert operation done");
		     }catch(SQLException e) {
		    	  e.printStackTrace();
		     }
	 }
	 
	 public static void insert1() {
		 
		   PreparedStatement ps=null;
		   
		     try {
		    	 
		      ps=con.prepareStatement("insert into employee values(?,?,?,?,?);");
		        boolean b=true;
		        int id=0;
		        String name="";
		        double sal=0.0;
		        String email="";
		        long phone=0l;
		        char key='N';
		        
		         do {
		        	  System.out.print("Enter ID: ");
		        	  id=sc.nextInt();
		        	  sc.nextLine();
		        	  System.out.print("Enter NAME: ");
		        	  name=sc.nextLine();
		        	  System.out.print("Enter SALARY: ");
		        	  sal=sc.nextDouble();
		        	  sc.nextLine();
		        	  System.out.print("Enter EMAIL: ");
		        	  email=sc.nextLine();
		        	  System.out.print("Enter PHONE NUMBER: ");
		        	  phone=sc.nextLong();
		        	 
		        	   ps.setInt(1, id);
			    	   ps.setString(2,name);
			    	   ps.setDouble(3, sal);
			    	   ps.setString(4,email);
			    	   ps.setLong(5, phone);
			    	   
			    	   
			    	   ps.execute();
			    	   System.out.println("press Y/y to continue --- press any other key to stop: ");
			    	   key=sc.next().charAt(0);
		        	 
		         }while(key=='Y' || key=='y');
		    	  
		    	   
		    	   System.out.println("insert operation done");
		     }catch(Exception e) {
		    	  e.printStackTrace();
		     }
	 }
	 
	 public static void update() {
		 
		 PreparedStatement ps=null;
		 int id=0;
		 double sal=0.0;
		 try {
		    ps=con.prepareStatement("update employee set sal=? where id=?;");
		    
		    System.out.println("type id and salary which you want to update");
		    
		    System.out.print("Enter ID: ");
      	    id=sc.nextInt();
      	    sc.nextLine();
      	    System.out.print("Enter SALARY: ");
      	    sal=sc.nextDouble();
		    
		    ps.setDouble(1, 9000);
		    ps.setInt(2, 11);
		    ps.execute();
		    System.out.println("update operation done");
		    
		 }catch(SQLException e) {
			  e.printStackTrace();
			  
		 }    
	 }
	 
	 public static void delete() {
		 
		 PreparedStatement ps=null;
		 int id=0;
		 try {
			 
			   ps=con.prepareStatement("delete from employee where id=?;");
			   
			   System.out.println("type id which you want to delete");
			    
			    System.out.print("Enter ID: ");
	      	    id=sc.nextInt();
			   
			   ps.setInt(1, id);
			   ps.execute();
			   
			   System.out.println("delete operation done");
		 }catch(SQLException e) {
			  e.printStackTrace();
		 }
		 
	 }
	 public static String read() {
		 
		  PreparedStatement ps=null;
		  String s="========================================== TABLE ==============================================================================\n";
		  ResultSet rs=null;
		  
		  try {
		  ps=con.prepareStatement("select * from employee;");
		  rs=ps.executeQuery();
		  while(rs.next()) {
			  int id=rs.getInt("id");
			    String name=rs.getString("name");
			    double sal =rs.getDouble("sal");
			    String email=rs.getString("email");
			    long phone=rs.getLong("phone");
			    
			    s= s+"ID : "+id+" \t||\tNAME : "+name+" \t||\tSALARY : "+sal+" \t||\tEMAIL : "+email+"\t||\tPHONE NUMBER : "+phone+"\n";
		 
		  }
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		    
		 return s;
	 }
	 
	 public static String readById() {
		  
	     PreparedStatement ps=null;
	     String s="========================================== TABLE ==============================================================================\n";
	     ResultSet rs=null;
	     int id1=0;
		 try {
			ps = con.prepareStatement("select * from employee where id = ?;");
			
			 System.out.println("type id which you want to fetch");
			    
			    System.out.print("Enter ID: ");
	      	    id1=sc.nextInt();
	      	   ps.setInt(1, id1);
			rs= ps.executeQuery();
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
