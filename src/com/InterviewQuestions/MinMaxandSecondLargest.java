package com.InterviewQuestions;

public class MinMaxandSecondLargest {
	

		/*
		 * Write a java program to find the second largest 
		 * number in the array? 
		 * Maximum and minimum number in the array?
		 */
		
		public static void main(String[] args) {
			
			int[] num = {10,26,15,8,14,27};
			
			int min=num[0];
			int max=num[0];
			int secondMax=num[0];
			int secondMin=num[0];
			
			
			for (int a:num) {
				
				if (a>max) {
				secondMax=max;
					max=a;
				}
				else if (a>secondMax) {
				secondMax=a;
				
			}
				else if (a<min) {
				secondMin=min;
				min=a;	
			}
				else if (a<secondMin) {
				
				secondMin=a;
				}}
			
			
		System.out.println("the max is "+ max);
		System.out.println("the secondMax is  "+ secondMax);
		System.out.println("the min is "+ min);
		System.out.println("the secondMin is "+ secondMin);

		}}
		
		//Long Method
//			int [] num = {10, 5, 30, 50,60,90};
//			int largest = num[0];
//			int  SecondLargest = num [0];
//			int max = num[0];
//			int min = num[0];
//			for (int i =0; i<num.length; i++) {
//				if (num[i]>largest) {
//					 SecondLargest = largest;
//					largest = num[i];
//				}
//				for (int b = 0; b<num.length; b++) {
//				if (num[i]> max) {
//					max = num[i];
//				}
//				for (int c = 0; c<num.length; c++) {
//					if (num[i] < min) {
//						min = num[i];
//					}
//				}
//				}
//				}
//			
//				System.out.println("The second largest number is "+SecondLargest);
//				System.out.println("Tha maximum number is " +max);
//				System.out.println("The minimum number is "+min);
//			

	
	
