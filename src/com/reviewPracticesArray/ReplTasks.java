package com.reviewPracticesArray;

import java.util.Scanner;

public class ReplTasks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
         String language = sc.nextLine();
        
         boolean flag=true;
          
         if(flag==language.contains("Java")) {
             System.out.println("Java is a programming language");
         }else if(flag==language.contains("C")){
             System.out.println("C is a procedural programming language");
         }else if (flag==language.contains("C++")){
             System.out.println("C++ is a middle-level programming language");
         } else {
                 System.out.println("Doesn't match any programming language");
             }}}