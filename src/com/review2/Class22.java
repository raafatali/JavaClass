package com.review2;

import java.util.Scanner;

public class Class22 {

	public static void main(String[] args) {

		Scanner scan;
		String  name;
		String result="";
		

		scan = new Scanner(System.in);

		System.out.println("enter name of the instructor");

		name = scan.nextLine();
		

		switch (name) {

		case "Shiva":

			result = "Will take care of Java Assignment";

			break;

		case "Sandish":

			result = "Will take care of SDLC Assignment";

			break;

		case "Weqas":

			result = "Will take care of Selenium Assignment";

			break;

		case "Asel":

			result = "Will take care of every Assignment";

			break;

		default: 

			result = "Invalid instructor selected";

	
		}

		System.out.println(result);
		
	}
}

		
