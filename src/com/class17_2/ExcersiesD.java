package com.class17_2;

import java.util.Scanner;

public class ExcersiesD {
	public static void main(String [] args) {
	
	ExcersiesD name=new ExcersiesD();
	
	name.printNumber();
	
}
void printNumber() {

		
		int year;
		
		Scanner scan=new Scanner(System.in);
		
		for (int a=0; a<=10; a++) {
		
		System.out.println("Enter the guess leap year");
		
		year=scan.nextInt();
		
		if (year %4!=0) {
			System.out.println(year+"wrong guess");
		}else if (year %4==0) {
			System.out.println("Congratualtions!!. you got" );
			break;
		}
		}
	}
}

