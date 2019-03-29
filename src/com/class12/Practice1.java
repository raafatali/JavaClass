package com.class12;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {

			num[i] = input.nextInt();

		}

		System.out.println();
		
		for (int i = num.length-1;i>=0; i--) {
			System.out.println(num[i]);

		}

	}
}
