package com.April4;

public class Greetings {

	public static void main(String[] args) {
		Greetings obj =new Greetings();
		obj.hello();
		//how to find largest number
		obj.findLargest(20, 10);//calling method FindLargest and passing values as 20&10
		obj.findLargest(30, 31);//calling method FindLargest and passing values as 30&31
		obj.findLargest(2000, 664674);
		obj.helloToInstructor("ali", "veli");
		obj.findLargest(60, 50);
		int ttl=obj.sum(4, 9);
		System.out.println(ttl);
	}
	
	void helloToInstructor(String a, String b) {//name="Awet"
		System.out.println("Hello "+a+"\nHello "+b);
	}

	void hello() {
		System.out.println("Hello");
	}
	void findLargest(int a, int b) {
		
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
		

	}
	int sum(int a,int b) {
		int result=a+b;
		return result;
	}

}
