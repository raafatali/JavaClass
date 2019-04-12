package com.class20;

public class Practice {

	public static void main(String[] args) {

		Practice obj = new Practice();
		String[] array = obj.word(" have a good morning");
		
		for (int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}

		for (String list : array) {
			System.out.println(list);

		}}

	private String[] word(String name) {

		return name.split(" ");

	}
}
