package com.class16;

//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android,
//Nokia with specific  attributes and behaviours.


public class Phone {
	
	String Type, brand;
    boolean Touch, keyboard;
    int screen, ram;
    
    public static void main(String[] args) {
		
    	Phone p1=new Phone();
    	p1.Type="iphone";
    	p1.brand="Apple";
    	p1.Touch=true;
    	p1.keyboard=true;
    	p1.screen=1;
    	p1.ram=8;
    
        
    	p1.watchMoives();
    	p1.playGames();
    	p1.playMusic();
        
        Phone p2 = new Phone();
        p2.Type="Galexy";
        p2.Touch=true;
        p1.keyboard=true;
        p2.screen=1;
        p2.ram=16;
        p2.brand="Samsung";
        
        p2.watchMoives();
        p2.playGames();
        p2.playMusic();
        
        Phone p3=new Phone();
        p3.Type="Plus";
        p3.Touch=false;
        p3.keyboard=true;
        p3.screen=1;
        p3.ram=24;
        p3.brand="Nokia";
        
        p3.watchMoives();
    	p3.playGames();
    	p3.playMusic();
        
        
	}
    
    void watchMoives() {
    	System.out.println("We can watch movie on a phone "+brand);
    }
	
	void playGames() {
		System.out.println("We can play games on a phone "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our phone "+brand);
	}
}
