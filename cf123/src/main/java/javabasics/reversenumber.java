package javabasics;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num, rev=0, r;
		Scanner s= new Scanner(System.in);
		System.out.println("enter number :");
	    num = s.nextInt();
	   
	    while(num>0)
	    {
	    r=num%10;
	    rev= rev*10+r;
	    num=num/10;
	    
	    }

	System.out.println("enter number :"+rev);
	
}
}
