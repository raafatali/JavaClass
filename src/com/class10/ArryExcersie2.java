package com.class10;

public class ArryExcersie2 {

//	Create an array of names and store all names of your group. 
//	Then print your name from that array. (use 2 different ways of 
//			creating an array).
//	

public static void main(String [] args) {
		
		String[] names= {"Raafat","Olga","Ken","Hussein","Bouss", "Fahri"};
        
        System.out.println(names[0]);
        
	//Another Way of doing Arry.
        
        String [] name=new String[6];
        
        name[0]="Raafat";
        name[1]="Olga";
        name[2]="Ken";
        name[3]="Hussein";
        name[4]="Bouss";
        name[5]="Fahri";
        				
        System.out.println(name[1]);
	}
}
