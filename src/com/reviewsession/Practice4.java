package com.reviewsession;

public class Practice4 {
	
	// Write a program to sum the values of an array
	//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	public static void main(String [] args) {
	
		int mult=0;
		
		int [] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i=0; i<10; i++) {
			mult*=numbers[i];
		}
		System.out.println(mult);
	}
}