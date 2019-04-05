package com.class17;

public class Task2 {
	
	
	//Create a method that will take a number and prints whether the number is even or odd.


	public static void main(String[] args) {
		
	     Task2 num=new Task2();
	     
	     num.oddOrEven(123);
	     
	    }
	    void oddOrEven(int num) {
	        if(num%2==0) {
	            System.out.println(num+" is Even");
	        }else if(num%2==1) {
	        
	            System.out.println(num+" is Odd");
	        }
	    }
	}





