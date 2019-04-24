package com.class27;

//Write program as a student class that has instance variables name and address.
//Create a constructor that will initialize those variables. Print name & address of 
//given  student by the displayInfo method.

public class student {

	String name;
	String address;

	 public student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public void displayInfo() {
		System.out.println("Student  name is "+name+" and the adress is "+address);
	}
	
	public static void main(String[] args) {
		
		student obj=new student("Raafat Ali", " 502 Seminary RD Alexandria" );
		obj.displayInfo();

	}}
	







