package com.class15;

public class ReviewInterviewQ2 {
	
	public static void main(String [] args) {
	
		 int[] arr = {10,26,15,8,14,27};
	        
	        int min = arr[0];
	        int max =arr[0];
	        int secondMax = arr[0];
	        
	        for(int a : arr) {
	            
	            if(a < min) {
	                min = a;
	                
	            }else if(a > max) {
	                secondMax = max;
	                max = a;
	                
	            }else if(a > secondMax) {
	                secondMax = a;
	            }
	        }
	        
	        System.out.println("Min: "+min);
	        System.out.println("Max: "+max);
	        System.out.println("Second Max: "+secondMax);
	    }

	}



//* 2.Write a java program to find the second largest number in the array?
//* Maximum and minimum number in the array?
//*/
//    public static void main(String[] args) {
//        int arr[] = { 1000, 46, 1, 86, 292, 2 };
//        
//        int min = arr[0];//0
//        int secondLargest = 0;//0
//        int largest = 0;//0
//        
//        for(int a: arr) {
//            if(a>largest) {
//                largest =a;
//            }
//            if(a < min) {
//                min = a;
//            }
//        }
//        for(int a : arr) {
//            
//            if(a> secondLargest && a <largest) {
//                
//                secondLargest = a;
//            }
//        }
//        System.out.println(“min = ” + min);
//        System.out.println(“Second Largest = ” + secondLargest);
//
//        System.out.println(“Largest = ” + largest);
//
//        
//        
//
//    }
//}
