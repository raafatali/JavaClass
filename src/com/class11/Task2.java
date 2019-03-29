package com.class11;

public class Task2 {
	
//	Create an array of countries. While retrieving all values from an array print 
//	capital for each country. 
//	(use 2 different loops).

	public static void main(String [] args) {
		
		String [] countries= {"Iraq", "Russia","Usa"};
		
		for (int i=0; i<countries.length; i++) {
		
            if(countries[i]==("Usa")) {
                System.out.println("The Capital is Washington");
            }
            if(countries[i]==("Russia")) {
                System.out.println("The Capital is Moscow");
            }
            if(countries[i]==("Iraq")) {
                System.out.println("The Capital is Baghdad");
		
	}

}
	}
}
