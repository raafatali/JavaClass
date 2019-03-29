package com.class11;


//Create an array of cars : american, german, korean, italian. Then retrieve all values from that array
public class PracticeReviewsCarTypes {
	
public static void main(String [] args) {
		
		String [][] cars= {
				
				{"American has cars types like: "+ "Dodge","Crysler"},
				{"German has cars types like: "+"BMW","Benz","Audi"},
				{"Korean has cars types like: "+"Hyndia","Kia","PMC","Daewoo"},
				{"Itilian has cars types like: "+"Lamborgini","Alfa","Pagani"},
				{"Toytota has cars types like: "+"Camry","Highlander","Corla"},
		};
		
		for (int i=0;i<cars.length; i++) {
			
			for (int k=0; k<cars[i].length; k++) {
				
				System.out.print(cars[i][k]+" ");
				
			}
			System.out.println();
		}
}
}
