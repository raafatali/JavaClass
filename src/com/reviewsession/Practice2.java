package com.reviewsession;

import java.util.Scanner;

public class Practice2 {

	public static void main(String [] args) {
		
		Scanner scan;
		String country;
		String favoriteFood;
		

		
		scan=new Scanner(System.in);
		
		System.out.println("What country are you from?");
			
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
		
		favoriteFood="Burger";
		
		break;
		
		case"Iraq":
		
		favoriteFood="Dolma";
		
		break;
				
		case"Mexico":
		
		favoriteFood="Taco";
		break;
		
		case "Spain":
		
		favoriteFood="Pasta";
		break;
		
		default:
			favoriteFood="Unknown";
		}	
			
		
		
		System.out.println(" your favorite food is "+favoriteFood+".");
		
		
		}
		
		
		}
				
