package com.class4;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String [] args) {
		// ask user for the name and print Good morning --
		
Scanner input=new Scanner(System.in);

System.out.println("Please enter your name");

	String name=input.nextLine();
	System.out.println(" Good morning "+ name);
	
	
	}
	
	

}
