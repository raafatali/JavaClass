package com.class15;

import java.util.Scanner;
public class interviewquestion {
	
	public static void main(String [] args) {
		
		/*
		 * Write a Java Program to find whether a String is palindrome or not? 
		 * (dad, mom, madam)
		 */
		
				
				Scanner scan=new Scanner (System.in);
				System.out.println("Please enter any word to check if it a palidrome!");
				String word=scan.nextLine();
				
				String reverse="";
				
				for (int i=word.length()-1; i>=0; i--) {
					reverse+=word.charAt(i);
				}
				
				if (word.equalsIgnoreCase(reverse)) {
					System.out.println("The word is palidrome ");
				}else {
					System.out.println("The word is not a palidrome");
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		//		int count=0;
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter number to check if it's prime?");
//        int n=in.nextInt();
//        for (int i=2;i<n;i++ ) {
//            if (n%i==0) {
//                count++;    
//            }
//       }
//    if (count==0) {
//        System.out.println("Number is prime.");
//    }else {
//        System.out.println("Number is not prime.");
