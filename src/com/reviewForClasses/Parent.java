package com.reviewForClasses;

public class Parent {

	child.parentNumbers(5,6);package com.class8;

	public class ChildInherintence extends MainInherintence {

		public void swapNumbers(int a, int b) {

			System.out.println(a);
			System.out.println(b);

		}

		public void swapWords(String a, String b) {

			System.out.println(a + " " + b);
		}

		// -----above is from child-------------
		void parentNumbers(int a, int b) {
			super.swapNumbers(a, b);
		}

		void parentString(String a, String b) {
			super.swapWords(a, b);
		}

		public static void main(String[] args) {
			ChildInherintence child = new ChildInherintence();
			child.parentNumbers(5, 6);
			child.parentString("Shaban", "Haq");
		}

	}package com.class8;

	public class ChildInherintence extends MainInherintence {

	    public void swapNumbers(int a, int b) {

	        System.out.println(a);
	        System.out.println(b);

	    }

	    public void swapWords(String a, String b) {

	        System.out.println(a + " " + b);
	    }
	//-----above is from child-------------
	    void parentNumbers(int a, int b) {
	        super.swapNumbers(a, b);
	    }

	    void parentString(String a, String b) {
	        super.swapWords(a, b);
	    }

	    public static void main(String[] args) {
	        ChildInherintence child=new ChildInherintence();
	        child.parentNumbers(5, 6);
	        child.parentString("Shaban", "Haq");
	    }

	}----------------package com.class8;

	public class MainInherintence {
	    
	    public void swapNumbers(int a, int b) {
	        
	        a=a+b;// a= 5+10=15;
	        b=a-b; // 10=15-10=5;
	        a=a-b; // a= 15-5=10;
	        
	        System.out.println(a);
	        System.out.println(b);
	        
	    }
	    public void swapWords(String a, String b) {
	        a=a+b;
	        b=a.substring(0,a.length()-b.length());
	        a=a.substring(b.length());
	        System.out.println(a+" "+b);
	}
	    }
