package com.InterviewQuestions;

public class Task1 {
	
//	1. Write a program to swap 2 numbers without a temporary variable? 
//	Swap  2 strings without a temporary variable?	

public static void main(String [] args) {

//swap 2 numbers without a temporary variable? 
    int x = 10;
    int y = 20;
    System.out.println("Before swap:");
    System.out.println("x value: "+x);
    System.out.println("y value: "+y);
    
    //Use this formula to swap
        
        x = x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    
        //Swap  2 strings without a temporary variable?	 
        
        String a="Raafat";
        String b="Olga";
        
        
        a = a + b;
        b = a.replace(b, "");
        a = a.replace(b, "");
    
        System.out.println(a);
        System.out.println(b);
        		
        		
        
     
}}
	
	
	
	
	
	

