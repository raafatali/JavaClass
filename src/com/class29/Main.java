package com.class29;

class Employee {
private String name;
public String getName() {
return name; }
public void setName(String name){
this.name=name; }
}
class Main {
public static void main(String[] args) {
Employee e=new Employee(); e.setName("Harry"); System.out.println(e.getName());
} }


























