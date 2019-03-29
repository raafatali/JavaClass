package com.reviewsession;


import java.util.Scanner;

public class CLassR {

	


	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Write a number between 1-7");
	int x=input.nextInt();
	while (x<1 || x>7){
	System.out.println("Write a number between 1-7");
	x=input.nextInt();}
	if(x==1){
	System.out.println("Monday");
	}
	else if(x==2){
	System.out.println("Tuesday");
	}
	else if(x==3){
	System.out.println("Wednesday");
	}
	else if(x==4){
	System.out.println("Thursday");
	}
	else if(x==5){
	System.out.println("Friday");
	}
	else if(x==6){
	System.out.println("Saturday");
	}else if(x==7){
	System.out.println("Sunday");
	}

	
	
	}
	}