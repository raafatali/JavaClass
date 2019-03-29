package com.reviewsession;


import java.util.Scanner;


//height less than 5 is short. less than 6 is medium. more than 6 is tall.


public class ReviewAb {
	
	
	public static void main(String []args) {
		
	
		
	 Scanner input=new Scanner(System.in);
	
	System.out.println(" Please enter your height ");
	
	double height=input.nextDouble();
	
		if(height<5) {
		
		System.out.println("the perosn is short");
		
	}else if (height >=5 && height <6) {
	
	System.out.println("the perosn is medium");
	
	
	}else {
	
	System.out.println("the perosn is tall");
	
	}
		

	}
			
		
	}
		
	
	
	
