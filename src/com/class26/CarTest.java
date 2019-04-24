package com.class26;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1=new BMW();
		car1.drive(10);
		
		
		Car car2=new Toyota();
		car2.drive();
		
		System.out.println("Another way of doing it");
		
		Car carType;
		
		carType= new BMW();
		carType.drive();
		
		carType=new Toyota();
		carType.drive();
		
		
	}
}