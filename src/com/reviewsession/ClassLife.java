package com.reviewsession;


import java.util.Scanner;

public class ClassLife {
	
	public static void main(String [] args) {
		
		int num1, num2, num3, largest;
		
		
		System.out.println("the largest value");
		
		Scanner scan=new Scanner(System.in);
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		
		if (num1>num2) {
			if (num1>num3) {
			largest=num1;
			}else {
				largest=num3;
			}
			
		}else   {
			
			if (num2>num3) {
				
				largest=num2;
				
			}else {
				largest=num3;
			}
			}
			
	
				
				System.out.println("the largest number is"+largest);
			
		}
	}
		
		
