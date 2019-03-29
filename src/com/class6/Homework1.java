package com.class6;


import java.util.Scanner;

public class Homework1 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double values");
		
		double num1, num2, num3;
		
		num1=input.nextDouble();
		
		num2=input.nextDouble();
		
		num3=input.nextDouble();
		
		if(num1>num2 && num1>num3) {
			
            System.out.println(num1+ " is the largest");
            
        }else if (num2>num1 && num2>num3) {
        	
            System.out.println(num2+ " is the largest");
            
        }else if (num3>num1 && num3>num2) {
        	
            System.out.println(num3+ " is the largest");
        }
				
		
	}
}
		
			

