package com.class29;


class Account { 
	//private data members  
	private long acc_no;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	public long getAcc_no() {  
	    return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
	    this.acc_no = acc_no;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public float getAmount() {  
	    return amount;  
	}  
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
	  
	}  

	class Main {
	  public static void main(String[] args) {
	    
	    //creating instance of Account class  
	    Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Sumair");  
	    acc.setEmail("sumair@syntaxsolutions.com");  
	    acc.setAmount(500000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  

	    
	  }
	}




















//class EncapsulationDemo{
//	  
//	  private String empName;
//	 private int empAge;
//
//	  public String getEmpName(){
//	        return empName;
//	    }
//
//	    public int getEmpAge(){
//	        return empAge;
//	    }
//
//	public void setEmpAge(int newValue){
//	        empAge = newValue;
//	    }
//
//	    public void setEmpName(String newValue){
//	        empName = newValue;
//	    }}
//
//	class Main {
//	  public static void main(String[] args) {
//	    EncapsulationDemo obj = new EncapsulationDemo();
//	         obj.setEmpName("John");
//	         obj.setEmpAge(30);
//	         System.out.println("Employee Name: " + obj.getEmpName());
//	         
//	         System.out.println("Employee Age: " + obj.getEmpAge());
//	  }
//	}
//	

	
	
	
	
//	--------------------------------------------------------------------	
//	public class EncapsulationDemo {
//	     
//		 private String empName;
//		private int empAge;
//		
//		public void setEmpName(String empName) {
//			this.empName=empName;
//			
//		}
//		public void setEmpAge(int empAge) {
//			this.empAge=empAge;
//		}
//		public String getEmpName() {
//			return empName;
//		}
//		public int getEmpAge() {
//		return empAge;
//	}
//	}
	
//	public class Main {
//	     
//		
//		public static void main(String[] args) {
//			
//			EncapsulationDemo obj=new EncapsulationDemo();
//			obj.setEmpName("John");
//			obj.setEmpAge(30);
//			System.out.println("Employee Name :"+obj.getEmpName());
//			System.out.println("Employee Age :"+obj.getEmpAge());
//		}
//		
//	}
//	
//	
//	--------------------------------------------------------------------
//	class EncapsulationDemo{
//	    
//	    private String empName="John";
//	    private int empAge=30;
//	    
//	    //Getter and Setter methods
//	   
//
//	    public String getEmpName(){
//	        return empName;
//	    }
//
//	    public int getEmpAge(){
//	        return empAge;
//	    }
//
//	    public void setEmpAge(int newValue){
//	        empAge = newValue;
//	    }
//
//	    public void setEmpName(String newValue){
//	        empName = newValue;
//	    }
//
//	  }
//
//
//	class Main extends EncapsulationDemo {
//	  public static void main(String[] args) {
//	    
//	    EncapsulationDemo obj = new EncapsulationDemo();
//	         obj.setEmpName("Mario");
//	         obj.setEmpAge(32);
//	         
//	         System.out.println("Employee Name: " + obj.getEmpName());
//	         
//	         System.out.println("Employee Age: " + obj.getEmpAge());
//
//	    
//	  }
//	}
//	
//	
//	
	
	