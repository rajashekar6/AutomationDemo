package javabasics;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, f=1;
		Scanner s= new Scanner(System.in);
		System.out.println("enter number :");
	    num = s.nextInt();
	    
	    for(i=2; i<num; i++)
	     {
	    	 if(num%i==0)
	    	 {
	    		 System.out.println(num +"is not a prime number");
	    		break; 
	    	 }
	    	 
	     }
	     if(num==i)
	     {
	     System.out.println(num +"is  a prime number");
	}
	}

}
