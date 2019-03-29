package com.reviewsession;


import java.util.Scanner;


public class KLCassC {
	
	public static void main(String [] args) {
		
		Scanner input;
		
		int age;
		
		input=new Scanner(System.in);
		
		System.out.println("whats the user age?");
		
		age=input.nextInt();
		
		if(age >1 && age<3) {
			
			System.out.println("Baby");
			
		}else if (age >3 && age<5) {
			
			System.out.println("toddler");
			
		} else if ( age > 5 && age < 13) {
			
			System.out.println("kid");
			
		} else if ( age > 13 && age < 20) {
			
			System.out.println("teenger");
			
} else if ( age > 20 && age < 64) {
			
			System.out.println("adult");
			
			
} else  {
	
	System.out.println("senior");
	
			
			
}
	}
}
