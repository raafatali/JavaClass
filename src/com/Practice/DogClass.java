package com.Practice;

public class DogClass {
	
	String breed, name, color;
	
	public static void main(String[] args) {
		
		DogClass object1=new DogClass();
		
		object1.breed="Husky";
		object1.name="Olga";
		object1.color="white";
		
		object1.bark();
		object1.run();
		object1.play();
		
DogClass object2=new DogClass();
		
		object2.breed="Bulldog";
		object2.name="Raafat";
		object2.color="black";
		
		object2.bark();
		object2.run();
		object2.play();
		
DogClass object3=new DogClass();
		
		object3.breed="Labrador";
		object3.name="Shi";
		object3.color="brown";
		
		object3.bark();
		object3.run();
		object3.play();
		
	}
	void bark() {
	System.out.println("Husky can bark");
	System.out.println("Husky can run");
	System.out.println("Husky can play");
	
	}
	void run () {
		System.out.println("Bulldog can bark");
		System.out.println("Bulldog can run");
		System.out.println("Bulldog can play");
		
	}
	void play () {
		System.out.println("Labrador can bark");
		System.out.println("Labrador can run");
		System.out.println("Labrador can play");
		
		
		

		
}}