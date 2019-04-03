package com.InterviewQuestions;

public class Task5 {
	
// 5. Write a java program to reverse String? Reverse a string word by word?
	
	public static void main(String [] args) {
		 
		String str= "Today is warm day";
		
	        String reverse="";
	    
	        char[] array=str.toCharArray();
	        
	        for(int i=array.length-1; i>=0;  i--  ) {
	            reverse=reverse+array[i];
	        }
	            
	        System.out.println(reverse);

	
	
	
	 System.out.println("------------------------");

	String name= "Today is warm day";
	
	String reverse1="";
	
	 for(int i=name.length()-1; i>=0; i--) {
	
	reverse1+=name.charAt(i);
	 

    }
    System.out.println(reverse1);
	 
}}
