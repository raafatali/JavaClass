

package com.review2;

import java.util.Scanner;

public class Practicenow {
	
		public static void main(String[] args) {
		    
		    Scanner scan;
		    
		    String car;
		    
		    String carOrigin;
		    
		    scan=new Scanner(System.in);
		    
		    System.out.println("Please enter your favorite car make");
		    
		    car=scan.nextLine();
		    
		    switch (car) {
		      
		      case "BMW": 
		    	  
		       carOrigin = "german car";
		        break;
		        
		        case  "Toyota": 
		        	
		         carOrigin= " japanese car";
		        break;
		        
		        case "Maserati" : 
		        	
		        carOrigin= "italian car";
		        break;
		        
		        default:
			  
			  carOrigin = "unknown";
		        
		    }
		    
				System.out.println(carOrigin);
				
		  }
		  }
		

	  
