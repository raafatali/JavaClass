package com.reviewsession;


/* if number between 1-10 Small
 * between 11---100 Medium
 * 
 * between 101-1000 Large
 * 
 * out of range
 */

public class Classk {

	public static void main(String [] args) {
		
		int num=22;
		
		if (num>1 && num<=10) {
		
		System.out.println("num is small");
		
		}else if (num>11 && num<=100) {
			
			System.out.println("num is medium");
			
		}else if (num>100 && num<=1000) {
			
			System.out.println("num is large");
			
		}else {
			
			System.out.println("num is out of range");
			
			
		}

	}
	
}
