package com.class16;

public class Dog {
	
	String breed, color;
    boolean bark, fur;
    int legs, tail;
    
    public static void main(String[] args) {
		
    	Dog d1=new Dog();
    	d1.color="white";
    	d1.bark=true;
    	d1.fur=true;
    	d1.tail=1;
    	d1.breed="Husky";
    
        
    	d1.beautifulAnimal();
        d1.player();
        d1.cuteandactive();
        
        Dog d2=new Dog();
    	d2.color="white";
    	d2.bark=true;
    	d2.fur=true;
    	d2.tail=1;
    	d2.breed="Bulldog";
        
        d2.beautifulAnimal();
        d2.player();
        d2.cuteandactive();
        
        Dog d3=new Dog();
    	d3.color="white";
    	d3.bark=true;
    	d3.fur=true;
    	d3.tail=1;
    	d3.breed="Labrador";
        
    	d3.beautifulAnimal();
        d3.player();
        d3.cuteandactive();
            
	}
    
    void beautifulAnimal() {
    	System.out.println("We can play with "+breed);
    }
	
	void player() {
		System.out.println("We can run with "+breed);
	}
	
	void cuteandactive() {
		System.out.println("We can be protected "+breed);
	}
}

