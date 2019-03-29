package com.class10;

public class ArryExcersie3 {
//	.Create an array of words: Java, Saturday, day, coding, is. 
//	Print the following sentence using element of array: 
//		“Saturday is Java coding Day”.

public static void main(String [] args) {
		
String[] words= {"Java","Saturday","day","coding","is"};

       //String Sentence= [1]+ " " + words[4]+" "+ words[0]+"  "+ words[3]+" "+ words[2];
		// System.out.println(Sentence);
System.out.println(words[1]+ " " + words[4]+" "+ words[0]+"  "+ words[3]+" "+ words[2]);
       
        
	//Another Way of doing Arry.

       String [] words1 = new String[5];
       words1[0] = "Java";
        words1[1] = "Saturday";
        words1[2] ="Day";
        words1[3] ="coding";
        words1[4] ="is";
        
        System.out.println(words1[1] +" "+ words1[4] +" "+ words1[0]+ " " + words1[3]+ " " + words1[2]);
       

       
}

}
