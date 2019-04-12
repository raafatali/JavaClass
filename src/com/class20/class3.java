package com.class20;

/*Create a method that will take a string and 
 * return an array of words from that string. 
 * Method should be available only within same class.
 */
public class class3 {
	
	public static void main(String [] args) {
		
		class3 obj=new class3();
	String[] array=obj.word("Have a good night students");
    for (int i=0; i<array.length; i++) {
        System.out.println(array[i]);
    }
    System.out.println("--------------------------");
    for (String word:array) {
        System.out.println(word);
    }}
    

private String[] word(String name) {
    String[] words=name.split(" ");
    return words;


}}
