package com.railworld;

public class Person {
     
	  public String name;
	  
	  public int age;
	  
	  public Gender gender;
	  
	  
	  
	  public Person() {
		// TODO Auto-generated constructor stub
	}



	public Person(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}
	  
	  
	
	
	// overloading
	public void info() {
		System.out.println("my name is "+ this.name + " and my age "+ this.age);
	}
	
	public void info(int i) {
		System.out.println("this is my "+ i +"th times info. my name is "+ this.name + " and my age "+ this.age);
	}
	
	
	
	  
}
