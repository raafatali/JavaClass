package com.reviewsession;
/**
 * Write a program that prints the following pattern
 *
 * ....1
 * ...22
 * ..333
 * .4444
 * 55555
 *
 */
public class Practice2a {

	public static void main(String [] args) {
		for(int i =1; i<=5; i++) {
	         for(int k = 1; k<=(5-i); k++) {
	             System.out.print(".");
	         }
	         for(int l = 1; l<=i; l++) {
	             
	             System.out.print(l);
	         }
	         
	         System.out.println();
		
		
		
		
	     }	
		}

	}