package javabasics;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int  pal=0, num, a;
			long i;
			Scanner s= new Scanner(System.in);
			System.out.println("enter number :");
			num=s.nextInt();
		    i=num; 
		    while(num>0)
		    {
		    	a=num%10;
		    	num=num/10;
		    	pal=pal+a;
		    }
		   /* if(pal==i)
		    {
		    	System.out.println("pal");
		    	
		    }else{
		    	System.out.println("not pal");
		    }*/
	System.out.println(pal);
	}
	

}
