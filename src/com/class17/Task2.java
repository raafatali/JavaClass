package com.class17;

public class Task2 {
	
	
	//Create a method that will take a number and prints whether the number is even or odd.


	public static void main(String[] args) {
		
	     Task2 num=new Task2();
	     
	     num.oddOrEven(123);
	     
	    }
	    void oddOrEven(int num) {
	        if(num%2==0) {
	            System.out.println(num+" is Even");
	        }else if(num%2==1) {
	        
	            System.out.println(num+" is Odd");
	        }
	    }
	}

//
//public class task1 {
//	int value;
//	public static void main (String[] args) {
//	task1 mother=new task1();
//	task1 father=new task1();
//		mother.value=45;
//		father.value=55;
//		mother.largest(mother, father);
//	}
//	void largest(task1 mother, task1 father )  {
//		if (mother.value>father.value) {
//			System.out.println("mother is the largest.");
//		}else { 
//			System.out.println("father is the largest.");
//		}
//	}
//	}
//
//
//public class DaysOfWeek {
//
//    public static void main(String[] args) {
//        
//        DaysOfWeek obj=new DaysOfWeek();
//        for(int i=0;i<7;i++) {
//            System.out.println(obj.DaysOfWeek(i));
//            };
//        
//        
//    }
//    String DaysOfWeek(int daynum) {
//        //System.out.println("I am inside a method");
//            if (daynum==1)
//                return "Sunday";
//            if(daynum==2)
//                return "Monday";
//            if(daynum==3)
//                return "Wednesday";
//            if(daynum==4)
//                return "Thursday";
//            if(daynum==5)
//                return "Friday";
//            if(daynum==6)
//                return "Saturday";
//            return null;
//                        
//        }
//
//}
//
//Armand(online) [3:26 AM]
//package class17;
//
//public class PalindromeMethod {
//
//    public static void main(String[] args) {
//
//        PalindromeMethod obj=new PalindromeMethod();
//        
//        obj.askPalindrome("was it a car or a cat i saw");
//    }
//        
//    
//     void askPalindrome(String word) {
//            
//            
//            String a=word;
//            a=a.replaceAll(" ", "");
//            StringBuffer str=new StringBuffer(a);
//            StringBuffer str2=new StringBuffer(str.reverse());
//            String s2=new String(str2);
//            
//
//                  if(a.equals(s2))
//                      System.out.println("'"+word+"'"+" is a Palindrome");
//                else
//                    System.out.println("it is not Palindrome");
//}
//
//}

//package class17;
//
//import java.util.Scanner;
//
//public class IsOdd {
//    boolean isOdd;
//
//    public static void main(String[] args) {
//        IsOdd obj=new IsOdd();
//        Scanner scan;
//        scan=new Scanner(System.in);
//       System.out.println("ENTER YOUR NUMBER: ");
//       int number=scan.nextInt();
//        obj.isOdd(number);
//
//    }
//    void isOdd(int number){
//        if(number%2==0) {
//             isOdd=true;
//        }else {
//             isOdd=false;
//        }
//        
//        System.out.println(isOdd);
//};
//
//}