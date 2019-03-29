package com.review2;

import java.util.Scanner;

public class Revoew {
	
	public static void main(String [] args) {
		
		Scanner scan;

		boolean thirsty,sleepy=true;
		
		String drink=" ";
		
		scan=new Scanner(System.in);
		
		System.out.println("Are you thirsty?");
		
		thirsty =scan.nextBoolean();
		
		System.out.println("Are you sleepy?");
		
		sleepy =scan.nextBoolean();
		
		if(thirsty &&  ! sleepy) {
			
			drink="Water";
			
		}else if (thirsty && sleepy) {
					
			drink="Coffee";
			
		}else if (!thirsty &&  sleepy) {
			
			drink="Tea";
			
		}else {
			
			drink="Nothing";
		}	
		
		 System.out.println("Looks like you need to drink "+drink);
		 
		
		}
}	
			
