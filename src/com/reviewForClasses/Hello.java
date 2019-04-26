package com.reviewForClasses;


/* Create a class called Hello
* create 1 constructor with one parameter
* create 1 constructor with two parameters
* create 1 constructor with three parameters
*
* i want you to use "this" key word and access those constructors pass values for each
* but have one print statement for each constructor with one variable. make sure you use same
* data type
*/

public class Hello {
	   Hello(String a,String b,String c){
	    System.out.println("1");
	   }
	   Hello(int a,int b){
	       this("a","b","c");
	       System.out.println("2");
	   }
	   Hello(int a){
	       this(1,2);
	       System.out.println("3");
	   }
	   public static void main(String[] args) {
	        Hello obj=new Hello(1);
	    }
	}



