package com.Class1;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		String nm;
		Scanner sc= new Scanner(System.in);
		nm=sc.next();
		
		System.out.println("The first 3 letters of " + nm +" is " + nm.substring(0, 3));

	}

}
