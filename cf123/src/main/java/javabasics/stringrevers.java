package javabasics;

import java.util.Scanner;

public class stringrevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s, rev="";
		Scanner s1= new Scanner(System.in);
		System.out.println("enter string:");
		s= s1.nextLine();
		int le= s.length();
		
		for(int i=le-1; i>=0; i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println("reverse of :"+ rev);
		
	}

}
