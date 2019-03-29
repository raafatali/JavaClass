package com.reviewPracticesArray;

public class Review4 {
	
//  Find the number of values above the value of 7.
public static void main(String [] args) {
	
	int[][] rating = { { 2, 6, 9, 3, 7 }, 
			{ 1, 7, 9, 4, 8 }, 
			{ 0, 4, 6, 2, 5 },
			{ 0, 1, 2, 3 } 
			};
	int sum = 0;
    for(int i=0;i<rating.length;i++) {
        for(int j=0;j<rating[i].length;j++) {
            if(rating[i][j]>7)sum++;
        }
    }
    System.out.println(sum);
}
}

//New method 
///    Find the number of values above the value of 7.
//int num = 7;
//int count = 0;
//for (int row = 0; row < rating.length; row++) {
//    for (int col = 0; col < rating[row].length; col++) {
//        if (rating[row][col] > num)
//            count++;
//    }
//}
//System.out.println("The number of elements above " + num + " is " + count);
//
