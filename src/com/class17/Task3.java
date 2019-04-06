package com.class17;

//	Create a method that will print whether given String is palindrome or not.

	
	public class Task3 {

	    public static void main(String[] args) {
	        Task3 str=new Task3();
	        str.palindrome("Hannah");
	        str.palindrome("Bob");
	        str.palindrome("John");

	    }void palindrome(String str){
	        String rev="";
	        for(int i=str.length()-1; i>=0; i--) {
	         rev+=str.charAt(i);
	    }
	        if(rev.equalsIgnoreCase(str)) {
	            System.out.println(str+" is palindrome");
	        }else {
	            System.out.println(str+" is not palindrome");
	        }
	        
	    }}

	
	
	
	
	
	
	
	
	
	
//	package com.class17;
//	public class task1 {
//		int value;
//		public static void main (String[] args) {
//		task1 mother=new task1();
//		task1 father=new task1();
//			mother.value=45;
//			father.value=55;
//			mother.largest(mother, father);
//		}
//		void largest(task1 mother, task1 father )  {
//			if (mother.value>father.value) {
//				System.out.println("mother is the largest.");
//			}else { 
//				System.out.println("father is the largest.");
//			}
//		}
//		