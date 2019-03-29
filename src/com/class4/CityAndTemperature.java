package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	
	public static void main(String [] args) { 
		
		String cityName;
		
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println(" Please enter your city ");
		
		cityName=myScanner.nextLine();
		
		
		/* Ask user to enter city and temperature in Fahrenheit
		 * Your program should convert to f-->C
		 * Your program should say"the temperature in the city ____is ___"
		 */
	
		

			System.out.println("Please enter temeperature in"+cityName);
			temp=myScanner.nextInt();
			
			// formula (F-32) * 5/9;
			
			int convertedTemp=(temp-32)*5/9;
			
			System.out.println("The temeperature in the city"+cityName+"is"+convertedTemp+"Celsius");
			
			
			
			
			
			
			
		}
		

	

}
