package com.railworld;

public class Main {
      
	   public static void main(String[] args) {
		    
		   
		   
//		     Person p = new Person("nikhil", 23, Gender.Male);
//		     
//		     
//		     // overloading
//		     
//		         p.info(200000);
//		         
//		         
//		         // overriding
		   
		   
//		       // same class object, same class reference.
//		       Employee emp = new Employee("1", 20000, "sunil", 21, Gender.Male);
//		         
//		         emp.info();
		       
		       // child class object and Parent class reference.
		          Person emp = new Employee("1", 20000, "sunil", 21, Gender.Male);
//		          
//		           emp.info();     // dynamic or runtime polymorphism
		           
		           
		              // object dawncasting 
		            Employee emp1 =     (Employee)emp;
//		            
		                emp1.childMethod();
		      
	}
}
