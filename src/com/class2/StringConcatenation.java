package com.class2;

public class StringConcatenation {
public static void main (String[] args) {
	String name="John"; 
	//My name is John;
	System.out.print("My name is"+name);
	String day="Sunday";
	//Sunday is a coding day
	System.out.println(day +"is a coding day");
	
	int num1=12;
	int num2=13;
	//the value of num1 is ___ and the value of num2 is ___
	System.out.println("the value of num1 is "+num1+"and value of num2 is "+num2+".");
	 
	String lastName="Smith";		
	char grade='B';
	String city="Fairfax";
	String state="VA";
	long phoneNumber=8329383866l;
	
	
	
	/* String name="John";
	  String lastName="Smith";
	  char grade='B';
	  String city="Fairfax";
	 String State="Va";
	 long phoneNumber=9234567890l;
	 Print:
	 My name is ____ and my last name is ____
	 I am ___ student 
	 I live in city of ____ in a state of ____ 
	 My phone number is _____
	 */
	System.out.println("my name is " +name+" my last name is "+lastName+".");
	
	System.out.println( " I am "+grade+ " student"+ ".");
	
	System.out.println( " I live in city of "+ city +" "+ " in the state of " + state + ".");
	
	
	System.out.println( " my phone Number "+ phoneNumber+".");
}
}

