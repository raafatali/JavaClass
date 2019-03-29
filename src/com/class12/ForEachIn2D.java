package com.class12;

//Create a grocery list: fruits{}
//*                         veggies{}
//*                         dairy{}
//* Retrive all values using 2 different loops

public class ForEachIn2D {
	
public static void main(String[] args) {
		
		String [][] groceryList= {
				{"Fruits:","Apple", "orange","Banana"},
				{"Veggies:","carrots", "lettus","cucumber"},
				{"Dairy:","cheese","yougurt","milk"}
		};
		
		for (int i=0;i<groceryList.length; i++) {
			
			for (int k=0; k<groceryList[i].length;k++) {
				
				System.out.print(groceryList[i][k]+" ");
			}
			
			System.out.println();
		
		}
		
		//Second advanced method:
		
		for(String[] item:groceryList) {
			
			for(String catgories:item) {
				
				System.out.print(catgories+" ");
			}
			System.out.println();			
}				
}
}