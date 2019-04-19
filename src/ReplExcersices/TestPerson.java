package ReplExcersices;

public class TestPerson { 
	
	public static void main(String[] args) {

	
	Employee obj= new Employee();
	obj.name="Joe";
	obj.lastName="Smith";
	obj.age=35;
	obj.salary=35000;
	obj.employee();
	
	
	Student obj1= new Student();
	obj1.name="Adam";
	obj1.lastName="Smith";
	obj1.age=15;
	obj1.grade=10;
	obj1.student();
	

	
	Retiree obj2= new Retiree();

	obj2.name="Frank";
	obj2.lastName="Smith";
	obj2.age=15;
	obj2.seniorActivity="tour";
	obj2.retiree();
	

}}















