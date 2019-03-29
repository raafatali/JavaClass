package com.reviewPracticesArray;

public class Review5 {
	
	 //Print the average of values in column 3.
	public static void main(String [] args) {
		
		
		int[][] rating = { { 2, 6, 9, 3, 7 }, 
				{ 1, 7, 9, 4, 8 }, 
				{ 0, 4, 6, 2, 5 },
				{ 0, 1, 2, 3 } 
				};
		
		
		int sumA =0;

		for(int i =0; i<rating.length; i++) {
		    
		    sumA+= rating[i][2];
		    
		}

		System.out.println(sumA/rating.length);
		
	}}
		
		
		
		
		
		//another way
//		int sum=0;
//		int avg=0;
//        
//        for(int b=0;b<rating.length;b++) {
//        for (int c=0; c<rating[3].length; c++)
//            sum+=rating[3][c];
//            
//        }
//        avg=sum/rating[3].length;
//        System.out.println(avg);
//        
//	}
//}