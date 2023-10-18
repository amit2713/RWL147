package com.railworld;

public class Employee extends Person {
	
	
	   
     
	   public String emId;
	   
	   public double salary;
	   
	   
	   
	   public  Employee() {
		    
	}



	public Employee(String emId, double salary, String name, int age, Gender gender) {
		  super(name, age, gender);
		this.emId = emId;
		this.salary = salary;
		
	}



	public String getEmId() {
		return emId;
	}



	public void setEmId(String emId) {
		this.emId = emId;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	   
	
	// info --- override 
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
	     System.out.println("this is my name "+ super.getName() + " and my salary is "+ salary);
	}
	
	
	public void childMethod() {
		  System.out.println("This is form employee");
	}
	   
	   
}
