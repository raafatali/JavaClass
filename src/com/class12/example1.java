package com.class12;


public class example1 {
	
	public static void main(String[] args){
		int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4}
		};
		
		
	        int sum=0;
	        for(int row=0;row<a.length;row++){
	            for(int col=0;col<a[2].length;col++){
	                sum+=a[row][2];
	            }
	            System.out.println(sum);
	       
	        }
	    }
	}