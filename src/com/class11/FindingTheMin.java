package com.class11;

//create an array of integers and find largest and smallest number
public class FindingTheMin {

	public static void main(String[] args) {

		int[] number = { 2,4, 5, 6, 7, 8, 23, 55, 349 };
		int max = number[0];
		int min = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] > min) {
				max = number[i];

			} else if (number[i] < min) {
				min = number[i];

			}

		}
		System.out.println(max + " is the max value ");
		System.out.println(min + " is the min value");
	}
}