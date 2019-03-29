package com.class11;

//Create an array of countries: north america countries, south america countries, 
//europe countries, asian countries, african countries.
//Then print all values from that array.

public class PracticeAboutCountiresContinuent {

	public static void main(String [] args) {
String [][] countries= {
			
			{"North America:", " USA", " Canda"},
			{"South America:", " Purgoay", "Brazil", " puro", " Cuba"},
			{"Euope:", " France", " Itlay", " Holand"},
			{" Asia:", " Iraq", " China", " Japan", " Korea"},
			{"Afria:" ," South Afriaca", " Egypt"," Libya"},
			};

	for(int i = 0; i<countries.length;i++) {
	for (int k = 0; k < countries[i].length; k++) {
			System.out.print(countries[i][k]+ " ");
		}

		System.out.println();
	}
}
}
