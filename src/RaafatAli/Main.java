package RaafatAli;

class Parent{ 
	Parent(int a){
  System.out.println("Parent Constructor in parent class with one argument");
}
}
class Child extends Parent{
  Child(){
    super(10);
  System.out.println("Child Constructor in child class with zero argument");
}

Child(int a){
  
    super(10);
  System.out.println("Child Constructor in child class with one argument");
}}

class Main {
  public static void main(String[] args) {
    
    new Child();
    new Child(10);
  }
}


















