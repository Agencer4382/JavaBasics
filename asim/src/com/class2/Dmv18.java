package com.class2;
import java.util.Scanner;


public class Dmv18 {

	public static void main(String[] args) {
		int age;
		
		
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter yor age");
		age=kevin.nextInt();
		
		
		if(age>=18) {
			System.out.println("get licence");
			
		}else {
			System.out.println("get permit");
		}
		
		

	}

}
