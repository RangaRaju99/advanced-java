package com.lpu;

import java.util.Scanner;

import com.entity.Student;

public class StudentDriver {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		 StudentCrudImpl stu=new StudentCrudImpl();
		 
		 System.out.println(" =======> HI ADMIN, LONG TIME, NO SEE <======== ");
		 System.out.println("I am reminding YOUR JOB ----- you can see the details of student\n\n\n");
		
		 char ch='n';
		
  do{
	  
	  System.out.println("PRESS -1 ====> to add student data into table\n"
		 		+ "PRESS -2 ====> to find student data by specific ID from table\n"
		 		+ "PRESS -3 ====> to get all the students data from table\n"
		 		+ "PRESS -4 ====> to update student data in table\n"
		 		+ "PRESS -5 ====> to delete student data in table\n"
		 		+ "PRESS -6 ====> to exit\n");
		System.out.print("Enter your choice: ");
		int choice =sc.nextInt();
		  switch(choice) {
		 
		  case 1:
			     char ch1='n';
			     int id=0;
			     String name="";
			     long phone=0;
			     Student s1=null;
			      do {   
			    	  
			    	  System.out.print("Enter the id: ");
			    	  id=sc.nextInt();
			    	  sc.nextLine();
			    	  System.out.print("Enter the name: ");
			    	  name=sc.nextLine();
			    	  System.out.print("Enter the phone: ");
			    	  phone=sc.nextLong();
			    	  
			    	  s1=new Student(id,name,phone); 
			          stu.saveStudent(s1);
			          System.out.print("to add more students --- press y/Y to continue or press any other key to stop: ");
			          ch1=sc.next().charAt(0);			    	  
			      }while(ch1=='y' || ch1=='Y');
			  
		          break;
			  
		  case 2:
			   
			      System.out.print("Enter the id you want to get: ");
			      int id1=sc.nextInt();
			      stu.findStudent(id1);
			      break;  
			  
		  case 3:
			  
			      stu.findAll();
			      break;
			  
		  case 4:
			   
			     System.out.println("Press 1 to update phoneno\n"
			     		+ "Press 2 to update name");
			     System.out.print("Enter the choice: ");
			     int choice1=sc.nextInt();
			      switch(choice1) {
			      
			      case 1:
			    	    
			    	  System.out.print("Enter the id you want to update: ");
			    	  int id2=sc.nextInt();
			    	  System.out.print("Enter the phone number to update: ");
			    	  long p1=sc.nextLong();
			    	  stu.updateStudentPhone(id2, p1);
			    	  break;
			    	  
			      case 2:
			    	   
			    	  System.out.print("Enter the id you want to update: ");
			    	  int id3=sc.nextInt();
			    	  sc.nextLine();
			    	  System.out.print("Enter the name to update: ");
			    	  String n1=sc.nextLine();
			    	  stu.updateStudentName(id3, n1);
			    	  break;
			    	   
			      }
			  
		  case 5:
			  
			  System.out.print("Enter the id of student to delete from table: ");
			  int id4=sc.nextInt();
			  stu.deleteStudent(id4);
			  
		  case 6:
			  
			  System.out.println("Thanks for your work");
			  break;
		  default:
			  System.out.println("I think you pressed wrong key");   
		 }
		  System.out.print("want to perform more operations  --- press y/Y to continue or press any other key to stop: ");
          ch=sc.next().charAt(0);	
		  
   }while(ch=='y' || ch=='Y');
		 
		// Student s1=new Student(14,"udaya",9878098756L);
	//	 stu.saveStudent(s1);
		 
	//	 stu.updateStudentName(11, "Rishith");
		 
	//	 stu.updateStudentPhone(12, 9392383411L);
		 
	//	 stu.deleteStudent(12);
		 
		// stu.findStudent(10);
		 
		 
	}
}
