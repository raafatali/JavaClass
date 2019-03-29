package com.review2;


import java.util.Scanner;

public class moth {
	
	public static void main(String[] args) {
	    
	    
	    Scanner scan;
	    
	    int number;
	    
	    String month;
	    
	    scan=new Scanner(System.in);
	    
	    System.out.println( "Input a number between 1-12");
	    
	    number=scan.nextInt();
	    
	    switch (number) {
	      
	      case 1: 
	        month="January";
	        break;
	        
	        case 2: 
	        month="February";
	        break;
	        
	        case 3 : 
	        month="March";
	        break;
	        
	        case 4: 
	        month="April";
	        break;
	        
	        case 5: 
	        month="May";
	        break;
	        
	        case 6: 
	        month="June";
	        break;
	        
	        case 7: 
	        month="July";
	        break;
	        
	        case 8: 
	        month="October";
	        break;
	        
	        case 11: 
	        month="November";
	        break;
	        
	        case 12: 
	        month="December";
	        break;
	        
	        default:
		  
		    month="Invalid";
	        
	    }
	    
			System.out.println(month);
			
	  }
	  }
	
