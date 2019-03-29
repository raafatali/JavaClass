package com.review2;

import java.util.Scanner;

public class NewA {

	public static void main(String[] args) {
	        String word1;
	        String word2;
	        int int1, int2;
	        
	        Scanner scan=new Scanner(System.in);
	        System.out.println(“Please enter two strings”);
	        word1=scan.nextLine();
	        word2=scan.nextLine();
	        System.out.println(“Please enter two numbers”);
	        int1=scan.nextInt();
	        int2=scan.nextInt();
	        
	        if(int1==int2 && word1.equals(word2)) {
	            System.out.println(“AND”);
	        }else if (int1==int2 || word1.equals(word2)) {
	            System.out.println(“OR”);
	        }else{
	            System.out.println(“NONE”);
	        }
	    }


