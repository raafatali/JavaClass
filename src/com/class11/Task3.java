package com.class11;



//Create an array on integers and calculate the sum of all elements in an array.

public class Task3 {

	
	public static void main(String [] args) {
		
		
		int [] sumNumbers= {40, 20, 30, 40};
		
		int sum=0;
		
		for (int i=0; i<sumNumbers.length; i++) {
			
		
			
			sum+=sumNumbers[i];
			
		}
			System.out.println(sum);
		}
	}

