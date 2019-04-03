package com.class14;

public class Task2 {
	
	
	//Create a String that should be combination of letters,
//	numbers and special characters. Find out how many alpha characters are there
//	in the String.

	public static void main(String [] args) {
		

	String name=" $%&1990 Raafat Ali, Olga Turova 1983  ";
	
//	String newString=name.replaceAll("[^A-Z a-z]", "");
//	
//	System.out.println(newString.length());
	
	System.out.println((name.replaceAll("[^A-Z a-z]", "")).length());
	
	
	
	
}}
