package WednsdayReview;


//Task1: Create class Parent, create a constructor of parent and have 
//constructor print "This is a Constructor".call class within Parent class

//Task 2: create 3 instance variables in class parent and then assign 
//values for those instance variables in your constructor class, then
//print those values in your main method by creating the object

public class Parent1 {
	
	String name;
	String lastName;
	int age;
	
	Parent1(){
		System.out.println("Im a constructor");
	}
	Parent1(String Olga, String Raafat, int ageNum){
		name=Olga;
		lastName=Raafat;
		age=ageNum;
		
	}
		public static void main(String [] args) {
		Parent1 obj= new Parent1("Olga", "Raafat",36);
		System.out.println(obj.name+" "+obj.lastName+" "+obj.age);
		

	
}}
