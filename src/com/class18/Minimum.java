package com.class18;

public class Minimum {

//	Create a class Called Minimum
//
//	with in it crate a method called minOfValuesmake it staticFrom your previous Applicaions 
	// class call the method and pass an array argument and print out the result

//	int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//int min=Integer.MIN_VALUE;or we can use this below

	static int minOfValues(int[] x) {

		int min = x[0];

		for (int y : x) {

			if (y < min) {
				min = y;
			}
		}

		return min;

	}

	static int maxOfValues(int[] array) {

		int max = array[0];

		for (int j = 0; j < array.length; j++) {

			if (array[j] >= max) {

				max = array[j];
			}

		}

		return max;

	}

	void print() {

		int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Printing the minimum value");

		System.out.println(minOfValues(my_array));
		System.out.println(maxOfValues(array));

	}

}