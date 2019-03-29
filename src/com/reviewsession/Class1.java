package com.reviewsession;

//height <5

import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		
		double height; 
		
		Scanner input;
		
		input=new Scanner(System.in);
		
		System.out.println("enter your height");
		
		height=input.nextDouble();
		
		if(height >=6) {
			
		System.out.println("the person is tall");
		
		}else if (height <6 && height>=5) {
			
			System.out.println("the perosn is medium");
			
		}else {
			
			System.out.println("the person is short");
			
			
		}
		
	}
}

