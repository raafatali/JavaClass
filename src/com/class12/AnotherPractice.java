package com.class12;

public class AnotherPractice {
	
	
	
	public static void main (String[] args){		 
	// declares an Array of integers.
	int[] array = new int[]{8, 25, 7} ;
	
    for(int i = 0; i<array.length ; ++i)
    	array[i]=array[i]*2;
	
	for (int i = 0; i < array.length ; ++i)
		System.out.println("Element at index " + i +" : "+ array[i]);		 
	}
}


