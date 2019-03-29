package com.class7;

public class loopszer {

	public static void main(String [] args) {
	
	boolean workDay= true;
	
	int day= 1;
	
	while (workDay) {
		
		System.out.println(" i need a day off");
		
		day++;
		
		if (day ==6) {
			workDay=false;
		}
		
	}System.out.println(" i dont need a day off");
		}
	}
