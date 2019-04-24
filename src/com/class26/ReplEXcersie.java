package com.class26;

class Parent{
	 int a=10,b=20;
	}
	class Child extends Parent{
	 int a=30;
	int b=40;
	void add(int a,int b){ //local variables
	 System.out.println(a+b); //local variables addition
	System.out.println(this.a+this.b); //current class variables addition
	System.out.println(super.a+super.b); //super class variables addition
	}
	}

	class Main {
	  public static void main(String[] args) {
	    Child obj= new Child();
	    obj.add(50,60);
	  }
	}

	
	
	
	
	