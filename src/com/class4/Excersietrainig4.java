package com.class4;

import java.util.Scanner;

public class Excersietrainig4 {

	public static void main(String [] args) {
		
		int num1, num2;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("please enter first number" );
		
	 num1=scan.nextInt();
		
		System.out.println("Please enter the second number");
		
	 num2=scan.nextInt();
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		if (num1>num2) {

			System.out.println(num1+ "is larger than" + num2);


		}else if (num2>num1) {
			
			System.out.println(num1+ "is smaller than num1"+num1);
		}else {
			System.out.println("num is equal to num2");
			
		}
		
		System.out.println("im done");
		
		
		
		
		
		
		
		
		
		
	}

}
