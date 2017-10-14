package javabasics;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter any number :");
	    no= s.nextInt();
	    if(no%2==0)
	    {
	    	System.out.println("even number");
	    }else{
	    	System.out.println("odd number");
	    }
		
	}

}
