package com.class4;


import java.util.Scanner;


public class Traning1 {
	
	public static void main(String [] args) { 
	
		Scanner input=new Scanner(System.in);
		System.out.println("enter the name of the city");
		String city=input.nextLine();
	System.out.println("What is the temperature in Fahrenheit");
	
	
	
	int temp=input.nextInt();

	
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temp in ur city "+city+" is "+convertedTemp+" C"+".");
	
	
	
	
	
		
	}
}

		
