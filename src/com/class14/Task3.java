package com.class14;

public class Task3 {
	
	
//	You have a String a=“Today is a good day! It is Thursday! 	We have a Java Class!“.
//How would you find out how many sentences are in that String?

public static void main(String [] args) {
	
	
	String a="Today is a good day! It is Thursday!We have a Java Class!";
	
//	String[] name=a.split("!");
//	
//    System.out.println(name.length);
    
    System.out.println((a.split("!")).length);
    
  

}}
