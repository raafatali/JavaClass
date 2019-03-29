package com.class5;

import java.util.Scanner;

public class ClassExample5 {
	
	
	
	public static void main(String [] args) {
		
Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first person height: ");
        double height = input.nextDouble();
        
        if(height < 5) {
        	
            System.out.println("Short");
            
        } else if(height >= 5 && height < 6) {
        	
            System.out.println("Medium");
            
        } else {
        	 
            System.out.println("Tall");
        }
        
       
    
    }

}
		


	


