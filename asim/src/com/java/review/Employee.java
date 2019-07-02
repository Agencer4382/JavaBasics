package com.java.review;

public class Employee {
	private String ssnNum;
	private String firstName;
	private String lastName;
	private int age;
	
	public String getSsnNum() {
		return ssnNum;
	}
	public void setSsnNum(String ssnNum) {
		this.ssnNum = ssnNum;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getInfo() {
		return "First Name = "+firstName+" \nLast Name = "+lastName+" \nAge = "+age+" \nSSN Number = "+ssnNum;
	}
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	
	
	
}
