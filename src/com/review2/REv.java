package com.review2;

import java.util.Scanner;

public class REv {
	
	public static void main(String [] args) {
		
		
		String a,b,result; 
		
		int x,y;
		
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter two strings");
		
		a=scan.nextLine();
		b=scan.nextLine();
		System.out.println("Please enter two numbers");
		
		x=scan.nextInt();
		y=scan.nextInt();
		
		if (x==y && a==b) {
			
			result="AND";
			
		}else if (x==y || a==b) {
		
		result="OR";
		
	}else {
	
		result="None";
		
	System.out.println("result");
		
	}			
}
}
	
