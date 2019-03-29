package com.class6;

import java.util.Scanner;

public class Homework8 {
	
	public static void main(String[] args) {
		
	 Scanner scan;
     String country;
     String language;
     
     scan=new Scanner(System.in);
     System.out.println("Please enter which country you are from");
     country=scan.nextLine();
     
     switch (country) {
     
     case "USA":
         language="English";
         break;
     case "Iraq":
    	 language="Arabic";
         break;
     case "Russia":
    	 language="Russian";
         break;
     case "Italy":
    	 language="Italian";
         break;
     case "Turkey":
    	 language="Turkish";
         break;
     case "Morocco":
    	 language="Aarabic";
         break;
     
     case "Japan":
    	 language="Japanies";
         break;
     default:
    	 language="Unknown";
     }
     System.out.println("your language "+language);
 }


}
	


