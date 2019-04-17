package com.reviewApril;

public class Main2 {


		 public static void main(String[] args) {
			    
			    StoreProduct store1=new StoreProduct("Eggs", 3 , "Produce", true, 10);
			    		
			   StoreProduct store2=new StoreProduct("Paper Towels", 2,  24);
			   
			   StoreProduct store3=new StoreProduct("Paper Towels", 2);
			   
			   System.out.println(store1.label+" "+ store1.price+" "+ store1.category+" "+
			   store1.hasExpiration+" "+   store1.stock);
			   System.out.println(store2.label+" "+store2.price+" "+store2.category+" "+
			   store2.hasExpiration+" "+store2.stock);
				 System.out.println(store3.label+" "+store3.price+" "+store3.category+" "+
			   store3.hasExpiration+" "+store3.stock); 
				  
			  }
			}
