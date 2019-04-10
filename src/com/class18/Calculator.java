package com.class18;

public class Calculator {
	
//Let’s create aclass called Calculator Have methods that take three inputs and return the result
//and return the sum, average, min and max

	int sum(int a, int b, int c) {
	        return(a+b+c);
	        
	    }

		int average(int a, int b, int c) {
	        return(a+b+c)/3;
	        
	    }

		int min(int a, int b, int c) {
	        
	        int min = a;
	        
	        if(b<a) {
	            min = b;
	        }
	        if(c<min) {
	            min = c;
	        }
	            
	        return min;
	        
	    }

		int max(int a, int b, int c) {
	        int max = a;
	        
	        if(b>a) {
	            max = b;
	        }
	        if(c>max) {
	            max = c;
	        }
	            
	        return max;
	        
	    }

	}

//
//public class Calculator {
//	public static int sum(int a, int b, int c) {
//		int sum=a+b+c;
//		return sum;
//		
//	}
//	public static int avg(int a, int b, int c) {
//		int avg=(a+b+c)/3;
//		return avg;
//	}
//	public static int max(int a, int b, int c) {
//		int max=0;
//		if(a>b && a>c) {
//		   max=a;
//			
//		}else if(b>a && b>c) {
//		   max=b;
//		}else {
//			max=c;
//		}return max;
//		
//	}
//	public static int min(int a, int b, int c) {
//		int min=0;
//		if(a<b && a<c) {
//		   min=a;
//			
//		}else if(b<a && b<c) {
//		   min=b;
//		}else {
//			min=c;
//		}return min;
//		
//	}