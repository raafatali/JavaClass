package com.class11;

public class Interviewquestions {
	
	public static void main(String [] args) {
		
		int[] numbers= { 200,20,13, 44, 70, 77};
		
		int largest=numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			
			if (numbers[i]>largest) {
				
				largest=numbers[i];
			}
		}
		System.out.println("the largest number is "+largest);
	}

}
