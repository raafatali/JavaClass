package com.reviewsession;

import java.util.Scanner;

public class Klass {



		public static void main(String[] args) {
			
			Scanner input;

			int num;
			
			input=new Scanner(System.in);
			
			System.out.println(" Enter the number");
			
			num=input.nextInt();

			if (num > 1 && num <= 10) {

				System.out.println("num is small");

			} else if (num > 11 && num <= 100) {

				System.out.println("num is medium");

			} else if (num > 100 && num <= 1000) {

				System.out.println("num is large");

			} else {

				System.out.println("num is out of range");

			}

		}

	}

