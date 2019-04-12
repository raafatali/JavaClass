package com.class18;

public class Application1 {

	
	 public static void main(String[] args) {

	        
	        Calculator calc = new Calculator();
	       
	        System.out.println(calc.sum(12, 13, 14));
	        System.out.println(calc.average(12, 13, 14));
	        System.out.println(calc.min(12, 13, 14));
	        System.out.println(calc.max(12, 13, 14));


	 }}

//import java.util.Scanner;
//public class AppCalculator {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		int c=scan.nextInt();
//		System.out.println(Calculator.sum(a,b,c));
//		System.out.println(Calculator.min(a,b,c));
//		System.out.println(Calculator.avg(a,b,c));
//        System.out.println(Calculator.max(a,b,c));
//	}
//
//}