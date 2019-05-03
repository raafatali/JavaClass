package com.class28;

	interface MyInterface1{
		   public void method1();
		}
		interface MyInterface2 extends MyInterface1 {
		   public void method2();
		}
		class Main implements MyInterface2{
		  /* Even though this class is only implementing the
		    * interface MyInterface2, it has to implement all the methods 
		    * of MyInterface2 as well because the interface MyInterface2 extends MyInterface1
		    */
		    public void method1(){
			System.out.println("method1-----welcome to syntax solutions");
		    }
		    public void method2(){
			System.out.println("method2-----hi syntax solutions how are you");
		    }
		  
		  public static void main(String[] args) {
		    
		    Main mm= new Main();
		    mm.method1();
		    mm.method2();
		  }
		}