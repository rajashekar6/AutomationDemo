package javabasics;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,num, arm=0, a;
		
		 Scanner s= new Scanner(System.in);
			System.out.println("enter number :");
			num=s.nextInt();
		    i=num;
		    while(num>0)
		    {
		    	a=num%10; num=num/10; arm=arm+a*a*a;
		    }
		    
	
		    if(arm==i){
			System.out.println("armstrong");
		}
		
		else{
			System.out.println("not armastrong");}}}
			

