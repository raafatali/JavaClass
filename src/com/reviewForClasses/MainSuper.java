package com.reviewForClasses;

class MainSuper {

//* I want you to create two classes one called MainInherintence and ChildInherintence
//*
//* in your main class i want you to create 1 method to swap numbers, and another to swap strings
//*
//* and in your child i want you to extend main, and i want you to create the same methods, and paramters, but in the block of code
//* i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String
//*



String name="burger";
boolean lettuce=true;
char grade='F';

MainSuper(){
   System.out.println("a parent with no parameter ");

}
MainSuper(String a) {

   System.out.println("a parent with one parameter " + a);
}

MainSuper(String a, String b) {

   System.out.println("a parent with 2 parameters " + b);
}



}

public class ChildSuper extends MainSuper {

String name="boy";
boolean lettuce=false;
char grade='A';

void print() {
   System.out.println(super.name+" "+super.lettuce+" "+super.grade);
   System.out.println(name+" "+lettuce+" "+grade);

}
ChildSuper(String a) {
   super(a);
   System.out.println("a child with 1 parameter " + a);
}

ChildSuper(String a, String b) {
   //super(a, b);
   System.out.println("a child with 1 parameter " + b);
}
public static void main(String[] args) {

   ChildSuper obj = new ChildSuper("hello", "bye");
   System.out.println("--------------------------------");
   obj.print();
   //ChildSuper obj1 = new ChildSuper("yes");
}

}


class ParentSuper{
String Parent="parent";

ParentSuper(){
   System.out.println("parent");
}
void hello() {
   System.out.println("hello world");
}

}

public class SuperKeyword extends ParentSuper{
String Parent="Child";

void hello() {
super.hello();
}

SuperKeyword(){
   super();
   System.out.println("child");

}

public static void main(String[] args) {
   SuperKeyword superKey=new SuperKeyword();
   superKey.hello();
}

}


public class Hello {

Hello(String a){
   this("hello","bye");
   System.out.println("This is the value of a: "+a);
}
Hello(String a, String b){
   this("First","Second","Third");
   System.out.println("This is the value of b: "+b);
}
Hello(String a, String b, String c){
   System.out.println("This is the value of c: "+c);
}

public static void main(String[] args) {
   Hello obj= new Hello("A");
}

}


public class Hello {

Hello(String a){
   this("hello","bye");
   System.out.println("This is the value of a: "+a);
}
Hello(String a, String b){
   this("First","Second","Third");
   System.out.println("This is the value of b: "+b);
}
Hello(String a, String b, String c){
   System.out.println("This is the value of c: "+c);
}

public static void main(String[] args) {
   Hello obj= new Hello("A");
}

}