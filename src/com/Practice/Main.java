package com.Practice;

public class Main {
	
String breed, name, color;
	
	public static void main(String[] args) {
		
		Main DogClass1=new Main();
		
		DogClass1.breed="Husky";
		DogClass1.name="Olga";
		DogClass1.color="white";
		
		DogClass1.bark();
		DogClass1.run();
		DogClass1.play();
		
Main DogClass2=new Main();
		
		DogClass2.breed="Bulldog";
		DogClass2.name="Raafat";
		DogClass2.color="black";
		
		DogClass2.bark();
		DogClass2.run();
		DogClass2.play();
		
Main DogClass3=new Main();
		
		DogClass3.breed="Labrador";
		DogClass3.name="Shi";
		DogClass3.color="brown";
		
		DogClass3.bark();
		DogClass3.run();
		DogClass3.play();
		
	}
	void bark() {
	System.out.println(breed+" can bark");

	
	}
	void run () {
		System.out.println(breed+" can run");
	}
	void play () {
		System.out.println(breed+" can play");
		

		
}}