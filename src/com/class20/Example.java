package com.class20;

public class Example {
	
	
	/* Create a method that will take a String and 
     * return whether String is palindrome or not. 
     * Method should be available to all classes within your projects.
     */
public static void main(String[] args) {

	Example obj= new Example();
	obj.isPalindrome("Raafat");
	
	System.out.println(obj.isPalindrome("Raafat"));
	
}

	public boolean isPalindrome( String name) {
		
		String reversed="";
		
		for (int i=name.length()-1;i>=0;i--) {
			
			reversed+=name.charAt(i);
					
		}
		
		if (reversed.equalsIgnoreCase(name)) {
			return true;
		}else {
			return false;
			
	
	

}}}
	
	