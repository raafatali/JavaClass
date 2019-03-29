package com.class11;


//Create an array of integers and find largest number
public class InterviewQuestion {
	
	public static void main(String [] args) {
		
		int [] number= {5,7,22,65,100,230};
		
		int large = number[0];
		
		for (int i=0; i<number.length; i++) {
			
			if (number[i]>large) {
			
		large=number[i];
		}	
		}
		
		System.out.println("the largest number is "+large);
		}
		
	}
	