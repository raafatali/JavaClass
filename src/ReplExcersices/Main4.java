package ReplExcersices;
class Main4 {
	  static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	  public static void main(String[] args) {
		  Main4 obj1=new Main4();
		  Main4 obj2=new Main4();
	       Main4 obj3=new Main4();
	       obj1.increment();
	       obj2.increment();
	       obj3.increment();
	       
	       System.out.println(obj1.count);
	         System.out.println(obj2.count);
	           System.out.println(obj3.count);
	  }
	}