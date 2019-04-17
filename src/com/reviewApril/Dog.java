package com.reviewApril;

public class Dog {
	
		String dogName;
		double dogWeight;
		static String dogBreed = "Mutt";
		
		Dog(String name, String breed, double weight){
		  dogName=name;
			dogWeight=weight;
			dogBreed=breed;
			System.out.println(dogName +" " +dogBreed +" "+dogWeight);
		}
		Dog(String name,double weight){
	    dogName=name;
			dogWeight=weight;
			System.out.println(dogName+" " +dogBreed+" " +dogWeight);
		}
	}