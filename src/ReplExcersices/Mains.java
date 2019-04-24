package ReplExcersices;

public class Mains {

	static int age;
	static String name;

	static void display() {
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		age = 40;
		name = "John"; 
		display();
	}
}