package com.class17;
//1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
//
//2.Create a method that will take a number and prints whether the number is even or odd.
//
//3.Create a method that will print whether given String is palindrome or not.

	public class MethodWithReturnValue {

		public static void main(String[] args) {
			String str = "Hello";

			int stringLength = str.length();// int stringLength=5
			System.out.println(stringLength);

			char character = str.charAt(3);
			System.out.println(character);

			MethodWithReturnValue obj = new MethodWithReturnValue();
			// String str=obj.askHowAreYou("Asel");
			String day = obj.whatIsADay();
			System.out.println("Today is " + day);
			
			//int num=obj.findLargestNum(20, 10);
			int largestNum=obj.findLargestNum1(20, 10);
			
			boolean isOdd;
			
			if(largestNum%2==0) {
				isOdd=false;
			}else {
				isOdd=true;
			}
			
			System.out.println(isOdd);
			
			
		}
		void askHowAreYou(String name) {// parameter
			System.out.println("How are you " + name);
		}
		String whatIsADay() {
			System.out.println("I am inside a method");
			return "Thursday";
		}

		void findLargestNum(int a, int b) {

			if (a < b) {
				System.out.println("A is largar than B");
			} else {
				System.out.println("B is largar than A");
			}
		}
		int findLargestNum1(int a, int b) {

			if (a > b) {
				return a;
			} else {
				return b;
			}
		}
	}
