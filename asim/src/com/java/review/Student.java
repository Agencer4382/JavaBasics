package com.java.review;

public class Student extends Person {
	
	String studentNum;
	
	public Student() {
		
	}
public Student(String name, int age, int weight) {
	
	this.name=name;
	this.age=age;
	this.weight=weight;
		
	}
public void sleep() {
	System.out.println("Student sleeps in class");
}

public void displayInfo() {
	super.displayInfo();
	System.out.println("I am a student."+name+" my number is "+studentNum);
	
}
protected void eat() {
	System.out.println("----eating---");
	

	
}

}
