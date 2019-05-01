package com.class28;

public interface MyInterface {

	 void method1();

	void method2();

}

class FirstMethod implements MyInterface {

	@Override
	public void method1() {
		System.out.println("implementation of method1");
	}

	@Override
	public void method2() {
		System.out.println("implementation of method2");
	}}
	class SecondMethod implements MyInterface {
		@Override
		public void method1() {
			System.out.println("implementation of method1");
		}

		@Override
		public void method2() {
			System.out.println("implementation of method2");
		
}}
	
	
