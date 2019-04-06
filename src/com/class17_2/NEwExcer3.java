package com.class17_2;

public class NEwExcer3 {
	

	public static void main(String [] args) {
		
		NEwExcer3 name=new NEwExcer3();
		name.printNumber();
		
	}
	void printNumber() {
		
	
	for ( int i=0; i<=6; i++ ) {
		 
        for(int a=0; a<=i; a++) {
            
            System.out.print("*");
        }
        System.out.println(); 
	
	}
	
	for ( int i=6; i>0; i-- ) {
		 
        for(int a=6; a>i; a--) {
            
            System.out.print("+");
        }
        System.out.println();
	
	}
} 
}