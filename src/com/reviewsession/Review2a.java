package com.reviewsession;

import java.util.Scanner;



/*we ahev 7 days a week
 * 1....5 -->week days
 * 6-7 weekend 
 * 
 * otherwise not a valid day
 */

public class Review2a {
	
	public static void main(String [] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("what is today's day");
		
		String day=input.nextLine();

		
		if (day=="Monday" || day=="Tuesday" ||day=="Wedensday" || day=="Thursday"|| day=="Friday") {
			
			System.out.println("it is a week day");
			
		}else if (day=="Saturday" ||day=="Sunday") {
			
			System.out.println("it is the weekend");
			
		}else {
			
			System.out.println("it is not a valid day");
		}
	}
	
	
	
	
	
	

}
