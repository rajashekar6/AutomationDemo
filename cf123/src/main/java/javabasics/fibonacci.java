package javabasics;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, f=0,se=1, num, next = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		num= s.nextInt();
	
		for(i=0;i<num;i++)
		{
			System.out.println(f);
		next= f+se;
		f=se;
		se=next;
		}
			
	}

}
