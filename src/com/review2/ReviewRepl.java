package com.review2;

import java.util.Scanner;

public class ReviewRepl {
	
	 
	 public static void main(String[] args) {
	   
	   Scanner scan;
	   int role;
	   String activity;
	   
	   scan=new Scanner(System.in);
	   
	   System.out.println("enter the roll number of the Child");
	   role=scan.nextInt();
	   
	  switch (role) {
	  
	  case 101:
	    activity="Student name: Ramesh ";
	    break;
	    
	  case 102:
	    activity="Student name: Mahesh ";
	    break;
	    
	  case 103:
	    activity= "Student name: Mukesh ";
	    break;
	    
	    default:
	  
	  activity="Not found Student name: in Class";
	  
	 }
	 

		System.out.println(activity);
		
	 }
}
	


