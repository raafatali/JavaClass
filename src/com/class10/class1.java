package com.class10;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {

		Scanner scan;
		int startRange, endRange;
		int sum=0;
		int sum1=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter start number");
		
		startRange=scan.nextInt();
		System.out.println("Plese enter a end number ");
		endRange=scan.nextInt();
		
		

		for( int a= startRange;  a<=endRange; a++) {
			if( a%2==0) {
			sum+=a;
				
		}else {
			sum1+=a;
		}
	}
    System.out.println( "The sum of even numbers equal to "+sum);
    
    System.out.println( "The sum of odd numbers equal to "+sum1);
	}
}