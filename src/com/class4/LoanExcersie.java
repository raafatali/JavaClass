package com.class4;

import java.util.Scanner;

public class LoanExcersie {
	
	public static void main(String [] args) {
	
	Scanner input= new Scanner(System.in);
	int loan;
	
System.out.println("How much loan do you want?");
	
loan=input.nextInt();

if (loan<200000) {
	System.out.println("you are elgible to take this money");
} else {
	System.out.println("you are not elgible to take this money");
}
	
	
}
	

}
	
