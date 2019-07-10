package com.class2;
import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	//name and print good morning
	
	Scanner input = new Scanner(System.in);
	System.out.println("enter your name");
	String name=input.nextLine();
	
	
	
	System.out.println("good morning "+name);
}
}
