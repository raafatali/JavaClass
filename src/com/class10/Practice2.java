package com.class10;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] days = new String[7];
		
		for (int x = 0; x < days.length; x++) {
			
			System.out.println("Please enter day " + (x + 1) + " of week");
			
			days[x] = input.next();

		}
		for (int i = 0; i <= days.length - 1; i++) {
			
			System.out.println(days[i]);
		}
	}
}