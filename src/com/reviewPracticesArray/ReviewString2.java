package com.reviewPracticesArray;

public class ReviewString2 {
	
	public static void main(String [] args) {
		
		String para = "  The quick brown fox jumps over the lazy dog. ";
		String para1 = " The quick brown fox jumps over the lazy dog.";

		
		System.out.println(para.length());
		System.out.println(para.toLowerCase());
		System.out.println(para.toUpperCase());
		System.out.println(para.equals(para1));
		System.out.println(para.equalsIgnoreCase(para1));
		System.out.println(para.contains("The"));
		System.out.println(para.equals(para1));
		System.out.println(para.startsWith("The"));
		System.out.println(para.endsWith("dog"));
		System.out.println(para.concat(para1));
		System.out.println(para.trim());
		System.out.println(para.charAt(5));
		System.out.println(para.indexOf("b"));
		System.out.println(para.substring(6));
		System.out.println(para.substring(8,14));

	}}

















