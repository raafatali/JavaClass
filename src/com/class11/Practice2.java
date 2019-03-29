package com.class11;

//Create a 2D array that first row will contain 4 names and second row will contain grades.
//Then you program should print name of the students 
//that has as an A and B grade

public class Practice2 {
	
	public static void main(String [] args) {
		
		String[][] names= {
		/*row0*/ {"Olga","Raafat","Ali","Turova", "Tareq"},
		/*row1*/ {"A","B","C","D","F"},
		 };
		
		System.out.println(names[0][0]+" had a grade of "+names[1][0]);
		System.out.println(names[0][1]+" had a grade of "+names[1][2]);
		System.out.println(names[0][3]+" had a grade of "+names[1][4]);
		System.out.println(names[0][2]+" had a grade of "+names[1][3]);
		
		
		
	}

}
