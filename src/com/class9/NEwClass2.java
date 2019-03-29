package com.class9;

public class NEwClass2 {
	
	public static void main(String [] args) {
		
		// Row = 4; Colum =6
		
        for (int a=1; a<=4; a++) { 
        	
            for(int b=1; b<=6; b++) {
            	
            	if (a==1 || a==4 ||b==1 || b==6) {
                	
                    System.out.print("*");
                    
                }else {
                	
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         
    }

}
