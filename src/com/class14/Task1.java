package com.class14;

public class Task1 {
	
//	Create a String that will hold a sentence. Write a program to get a new String
//	without any spaces.

	
	public static void main(String [] args) {
		
		// The short way
		
		String name=" Hello Olga, how is life  ";
		
		
      System.out.println(name.replace(" ",""));
	
	
      //the long way
      
	String name1=" Hello Olga, how is life and everything  ";
       
       String list=name1.replace(" ","");
       
       System.out.println(list);
       
       
       
       
}}