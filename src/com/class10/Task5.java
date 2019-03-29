package com.class10;

import java.util.Scanner;
public class Task5 {
	
	public static void main(String [] args) {
		
		Scanner scan;
		
		int guessNumber;
		
		int secretNumber=11;
		
		scan=new Scanner(System.in);
		
		System.out.println("what is the guess number");
		
		
		for (int a=1; a<=20; a++) {
			
			System.out.println("Enter the guess number");
			
			guessNumber=scan.nextInt();
			
			
			if (guessNumber> secretNumber) {
				System.out.println("too large");
				
			}else if (guessNumber< secretNumber) {
				System.out.println("too small");
				
			}else {
				
				System.out.println("congratulation: you got it");
			}
		}
		
		
		
		
	}

}
