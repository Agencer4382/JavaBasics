package com.task6and7;

import java.util.Scanner;

public class SwitchBreak2 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner kevin=new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		number=kevin.nextInt();
		
		switch(number) {
		case 101:
			System.out.println("Student name: Ramesh ");
			break;
		case 102:
			System.out.println("Student name: Mahesh ");
			break;
		case 103:
			System.out.println("Student name: Mukesh ");
			break;
			default:
				System.out.println("Not found Student name: in Class");
				break;
			
		}
		

		
	}

}
