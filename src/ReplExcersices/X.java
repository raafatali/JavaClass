package ReplExcersices;




class z{
	
	static void print() {
		System.out.println("Class X");

	}
}

class Y extends X {
	static void print() {
		System.out.println("Class Y");

	}
}
class Main{
	public static void main(String[] args) {
		
		Y obj=new Y();
		obj.print();
}}

