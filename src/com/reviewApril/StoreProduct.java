package com.reviewApril;

public class StoreProduct {
	  
String label;
	int price;
	String category;
	boolean hasExpiration;
	int stock;
	
	StoreProduct(String labels, int prices, String categories, boolean hasExpirations, int stocks){
		 label=labels;
		 price=prices;
		 category=categories;
		 hasExpiration=hasExpirations;
		 stock=stocks;
		
	}
	
	StoreProduct(String labels, int prices, int stocks){
		label=labels;
	    price=prices;
	    category="misc";
	    hasExpiration=false;
	    stock=stocks;
	}
	StoreProduct(String labels, int prices){
		label=labels;
		price=prices;
		
		stock=0;
	}
	
}