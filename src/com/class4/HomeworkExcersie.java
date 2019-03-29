package com.class4;


import java.util.Scanner;

public class HomeworkExcersie {
	

	public static void main(String [] args) {
		
		String cityName;
		
		int temp;


		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		
		
		System.out.println("please enter temeprature in"+cityName);
		temp=myScanner.nextInt();
				
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temeperature in the city"+cityName+"is"+convertedTemp+"Celsius");
		
		
		
		
		
	
	
	}
		
}
