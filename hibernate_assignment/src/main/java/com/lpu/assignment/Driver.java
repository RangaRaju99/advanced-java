package com.lpu.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String args[]) {
		
		BankAccountCrudImpl bc1=new BankAccountCrudImpl();
		
		// user data
		  Account a1= new Account(10,"Raju",200.00);
		  Account a2=new Account(11,"rish",300.00);
		  Account a3=new Account(12,"poori",400.00);
		  
		  List<Account> l1=new ArrayList<>(Arrays.asList(a1,a2,a3));
		  
		  Bank b1=new Bank(101,"SBI","India",l1);
		  
		  Account a11= new Account(20,"anjan",1000.00);
		  Account a22=new Account(21,"vignan",3000.00);
		  Account a33=new Account(22,"vamsi",4000.00);
		  
		  List<Account> l2=new ArrayList<>(Arrays.asList(a11,a22,a33));
		  
		  Bank b2=new Bank(102,"HDFC","USA",l2);
		  
		  // 1)
//		         bc1.saveBank(b1);
//		         bc1.saveBank(b2);
		       
		  // 2) 
		       //  bc1.updateBank(101);
		        
		  // 3)
//		        Bank bank1=  bc1.findBankById(101);
//		        System.out.println(bank1);
		      
		  // 4)
		      
//		        Bank bank2= bc1.findBankByName("HDFC");
//		        System.out.println(bank2);
		      
		  // 5)
		  
//		       Account a4=new Account(13,"udaya",500.00);
//		       bc1.assignAccountToBank(102, a4);
		       
		   // 6) 
//		           List<Account> l3=new ArrayList<>(Arrays.asList(new Account(14,"roy",600.00),new Account(15,"sohel",700.00)));
//		           bc1.assignAccountsToBank(101, l3);
		           
		   // 7) 
		           
		          List<Account> l4= bc1.findAllAccountsInBank(102);
		            for(Account a:l4) {
		        	     System.out.println(a);
		           }
		           
		           
		  
		  
		  
	}
}
