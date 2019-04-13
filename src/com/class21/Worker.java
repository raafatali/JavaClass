package com.class21;


public class Worker {
	
	int age;
	int weigth;
	public static String beautiful="Olga";
	
	
	public static void main(String[] args) {
	
		Worker name1=new Worker();
		name1.age=1;
		name1.weigth=200;
		name1.annoying();
		
		

		Worker name2=new Worker();
		name2.age=2;
		name2.weigth=500;
		name2.annoying();
	}
	
	public void  annoying() {
		System.out.println("beautiful "+beautiful+" ID:"+age+" with annoying  of "+weigth);
		
		

		
		
		
		
		

}}
