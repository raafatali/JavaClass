package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

//3.Create an arrayList of drinks. 
//If any drink has letter “a” or “e” replace it with water.

public class drinksArrayList {

	public static void main(String[] args) {

		ArrayList<String> drink = new ArrayList<String>();

		drink.add("Vodka");

		drink.add("juice");

		drink.add("beer");

		drink.add("viski");

		for (int i = 0; i < drink.size(); i++) {
			String name = drink.get(i);

			if (name.contains("a") || name.contains("e")) {
				drink.set(i, "Water");
			}
		}

		System.out.println(drink);
	}
}








