package com.review2;

import java.util.Scanner;

public class reviws {
	
	public static void main(String [] args) {
	
	Scanner scan;
	
	int month;
	
	String season="Unknown";
	
	scan=new Scanner(System.in);
	
	System.out.println("Please enter your birthday month number");
	
	month= scan.nextInt();
	
	if (month==12 || month ==1 || month==2) {
		
		season="Winter";
		
}else if (month==3 || month ==4 || month==5) {
		
		season="Spring";
		
}else if (month==6 || month ==7 || month==8) {
		
		season="Summer";
		
}else if (month==9 || month ==10 || month==11) {
	
	season="Fall";
	
}else {
	
	System.out.println("Please eneter a valid month number");
	
}
	System.out.println( "You were born in "+ season);
}
}
	

		
		