package com.class9;

public class ArryaAndNestedLoops {
	
	public static void main(String [] args) {
		
		
		for (int i =0; i<3; i++) {
			
			for (int y=0; y<3; y++) {
				
				System.out.println("i'm inner loop"+y);
			}
			
			System.out.println("----------i'm outer loop--------"+i);
		}
	}

	}

