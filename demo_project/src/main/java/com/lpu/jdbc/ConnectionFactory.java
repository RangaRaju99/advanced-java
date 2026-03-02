package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// approach-1
public class ConnectionFactory {
	
	    private static Connection conn=null;
	    private static final String url="jdbc:mysql://localhost:3306/lpu";
	    private static final String user="root";
	    private static final String pass="Root";

	    static {
		  
		  try {
	    	  
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   conn=DriverManager.getConnection(url,user,pass);
	
	      }catch(ClassNotFoundException | SQLException e) {
	    	     e.printStackTrace();
	      }
		  
	    }
	    
	    public static Connection getConnection() {
		  return conn;
	  }
}
