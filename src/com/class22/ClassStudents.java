package com.class22;

//Write a java program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to Calculate Average Grade. 
//Test Student class for 5 different students with different marks. 
//Your program should print an average mark of each students name.
//NOTE: please male different names for instance and local variables.

public class ClassStudents {
	
	
	String name;
	int grades;
	
	public ClassStudents(String name) {
		System.out.println("my name is "+name+ "and my average");
		
	}
	
	int findAverage(int a, int b, int c) {
		
		return(a+b+c)/3; 
	
	
	
	
	
}}