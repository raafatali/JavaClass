package com.class31;

import java.util.ArrayList;

import java.util.Iterator;

//2.Create an arrayList of words. 
//Remove every word that ends with “e”.

public class wordsArrayList {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("love");

		words.add("life");

		words.add("Raafat");

		words.add("learning");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();

			if (word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}

}






