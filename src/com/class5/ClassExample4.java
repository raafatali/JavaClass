package com.class5;

import java.util.Scanner;

public class ClassExample4 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Enter th score of your quiz ");
        
        int  quiz = input.nextInt();
        
        System.out.println("Enter the score of your midterm");
        
        int  midTerm = input.nextInt();
        
        System.out.println("Enter the score of your finalScores");
        
        int finalScores=  input.nextInt();
        
        int avg=(quiz+midTerm+finalScores)/3;
        
        System.out.println("your avgScore"+ avg);
        
	if(avg>=90) { 
        
        System.out.println("grade A");
        
        }else if(avg>=70 && avg <90) {
        
        System.out.println("grade B");
        
	}else if(avg>=50 && avg <70 ) {
        
        System.out.println("grade C");
        
}else {
	
	System.out.println("grade F");
}
        
        
      
}
}
        
        
    