package com.review2;

import java.util.Scanner;

public class NEwS {
	
public static void main(String [] args) {
		
	Scanner scan;
	Boolean loan;
	String eligibility;
	int score;
	
	scan=new Scanner(System.in);
	
	System.out.println("Do you need a loan?");
	
	loan=scan.nextBoolean();
	
	eligibility=scan.nextLine();
	
	score=scan.nextInt();
	
	if (loan) {
		System.out.println("What is your credit score?");
		
		
	if (score >600 ) {
		
		eligibility="Not eligibile";
		
	}else if ( score >600 && score <700) {
		eligibility="Maybe eligible";
	}else if ( score >701 && score <800) {
		eligibility="Eligible";
		
	}else if ( score > 800) {
		eligibility=" Definitely eligible";
	}
		
	}else {

		eligibility="Unknown";
	}
		
		System.out.println(" The eligibility is "+ eligibility);
		
	}	
		
	}
		
	
		
		
