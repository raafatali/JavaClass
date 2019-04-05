package com.Practice;

public class Parents {
	
	String hiarColor, gender, body, skinColor;
	boolean hairy,tall,fat;
	int weight,height,footSize;
	
	public static void main(String[] args) {
		
	//Define object1
		
		Parents dad=new Parents();
		
		dad.hiarColor="black";
		dad.gender="male";
		dad.body="normal";
		dad.skinColor="white";
		dad.hairy=true;
		dad.tall=true;
		dad.fat=false;
		dad.weight=210;
		dad.height=6;
		dad.footSize=10;
		
		System.out.println("Tareq who is my dad is the most annoying Father in the world");
		
		//Define behavoirs1:
		
		dad.frustrating();
		dad.annoying();
		dad.lovely();
		
//Define object2
		
		Parents mother=new Parents();
		
		mother.hiarColor="brown";
		mother.gender="female";
		mother.body="normal";
		mother.skinColor="white";
		mother.hairy=false;
		mother.tall=true;
		mother.fat=false;
		mother.weight=180;
		mother.height=6;
		mother.footSize=9;
		
		System.out.println("Mama who is my mother is the most lovely and patinet mom on earth");
		
		//Define behaviors:
		
		
		mother.frustrating();
		mother.annoying();
		mother.lovely();
		
		
	}
	void frustrating() {
		System.out.println(" he or she can be frustrating" );
		
	}
	void annoying() {
		System.out.println(" sometimes he or she is annoying and repeating stuff");
	}
	void lovely(){
		
		System.out.println("Overall they are my lovely parents");
		
			
	}}
