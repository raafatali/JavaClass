package com.reviewsession;

import java.util.Scanner;

public class ClassG {
	
	public static void main(String[] args) {

        Scanner scan;
        int sales;
        int commission;
        
        scan =new Scanner(System.in);
        System.out.println("Please enter sales amount");
        sales=scan.nextInt();
        if (sales>0 && sales<100) {
            commission=2;
        }else if (sales>=100 && sales<200) {
            commission=5;
        }else if (sales>=200 && sales<500) {
            commission=10;
        }else if (sales>=500) {
            commission=20;
        }else {
            commission=0;
        }
        System.out.println("Your commision is "+commission);
        
    }
}
