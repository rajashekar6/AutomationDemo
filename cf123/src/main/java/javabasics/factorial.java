package javabasics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 long i, fect=1, num;
	 Scanner s= new Scanner(System.in);
		System.out.println("enter number :");
	    num = s.nextInt();
	    
	    for (i=1; i<=num; i++)
	    {
	    	fect= fect*i;
	    	
	    }
	    System.out.println(fect);
	}

}
