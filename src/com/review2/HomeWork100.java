package com.review2;

import java.util.Scanner;

public class HomeWork100 {
	
public static void main(String [] args) {
		
		Scanner scan;
		
		Boolean weekend;
		
		String result;
		
		scan=new Scanner(System.in);
		
		System.out.println("Is it weekend?");
		
		weekend=scan.nextBoolean();
		
		if (! weekend) {
			
			result="Manual testing ";
			
		}else {
			
			result="Java";
			
		}
			System.out.println("Today you will be learning "+result);
			
			
		}
}

