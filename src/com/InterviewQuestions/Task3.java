package com.InterviewQuestions;

public class Task3 {
	
	
	//3. Find out how many alpha characters present in a string?
	
	public static void main(String [] args) {
		

String str = "Welcome To $#^@^@ ^&@ $ !^@^#$ Fairfax 1234";

String count=str.replaceAll("[^A-Za-z]", "");

System.out.println(count.length());



//another method:
String str1 = "123We are the best456%%";
String newstr = str1.replaceAll("[^A-z]", "");

System.out.println(newstr.length());

}}





