package com.class17_2;

public class ExcersiesB {

	public static void main(String[] args) {

		ExcersiesB name=new ExcersiesB();
		
		name.printNumber();
		
	}
	void printNumber() {
		
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b <=a; b++) {

			System.out.print("*");

			}
			System.out.println();
		}
		for (int a = 5; a > 0; a--) {
			for (int b = 0; b<a; b++) {

			System.out.print("*");

			}
			System.out.println();
	}
}

}