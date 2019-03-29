package com.class11;

public class Task1 {
	
	public static void main(String [] args) {
		
	String [] cars= {"BMW", "Ford", "Toyota", "Bougati","Jeep","Highlander"};
	
	for (int i=0; i<cars.length; i++) {
	
	System.out.print(cars[i]+" ");
	
	}
// advanced method of Array:
String [] cars1= {"BMW", "Ford", "Toyota", "Bougati","Jeep","Highlander"};
	
	for (String types:cars1) {
	
	System.out.println(types);
	
}
}
}
