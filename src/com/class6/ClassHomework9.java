package com.class6;

import java.util.Scanner;


public class ClassHomework9 {

	public static void main(String[] args) {
	
		 Scanner scan;
	     String grade;
	     String student;
	     
	     scan=new Scanner(System.in);
	     System.out.println("Please enter you grade");
	     grade=scan.nextLine();
	     
	     switch (grade) {
	     
	     case "A":
	    	 student="Excellent";
	         break;
	     case "B":
	    	 student="Good";
	         break;
	     case "C":
	    	 student="Average";
	         break;
	     case "D":
	    	 student="Bad";
	         break;
	     
	     default:
	    	 student="your grade is not acceptable";
	     }
	     
	     System.out.println("your grade "+grade +" whcih is "+ student);
	    
	 }


	}
	
	

