package com.java.review;

public class Teacher extends Person {
	
	int salary;
	
	public Teacher() {
	
	}
	
	public Teacher(String name, int age, int salary, int weight) {
		super(name,age,weight);
		this.salary=salary;
		
	}
	public void teach() {
		System.out.println("taech");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("I am a teacher and my name is " + this.name + " and my age is " + age + " and weight is " + weight+" and my salary is "+salary);
	}

}
