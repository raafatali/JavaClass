package com.class17_2;

import java.util.Scanner;
public class ShoopingPayment {
	 
	public static void main(String [] args) {
		
		ShoopingPayment name=new ShoopingPayment();
		name.printNumber();
	}
	void printNumber() {
		
		
double sum=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the item you want to buy");
        String item=scan.nextLine();
        System.out.println("Enter the price for the item");
        double price=scan.nextDouble();
        
        do {
        System.out.println("Now please pay for your item");
        double price1=scan.nextDouble();
            sum+=price1;
            System.out.println((price-sum)+" is left to pay off the amount");
        
        }
        while (sum<price);
        System.out.println("Thank you for shopping with us");
    
        
            
        
        }
                
    }
	


