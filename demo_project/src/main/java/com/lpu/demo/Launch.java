package com.lpu.demo;

public class Launch {

	
	// PALINDROME 
	  public static boolean pal(String s) {
		   
		    for(int i=0;i<s.length()/2;i++) {
		    	if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
		    		 return false;
		    	}
		    }
		    return true;
	  }
	  
	  
	  // PRIME
	  public static boolean prime(int n) {
		   
		   if(n<0) return false;
		   if(n!=2 && n%2==0) return false;
		   if(n==2) return true;
		   for(int i=3;i<=Math.sqrt(n);i+=2) {
			     if(n%i==0) return false;
		   }
		   return true;
	  }
	  
	  
	  // ARMSTRONG 
	  public static boolean armstrong(int n) {
		    
		    int count=(int)Math.log10(n)+1;
		    int temp=n;
		    int sum=0;
		    while(temp>0) {
		    	 int rem=temp%10;
		    	 sum+=(int)Math.pow(rem,count);
		    	 temp/=10;
		    }
		    
		  return sum==n;
	  }

	 

}
