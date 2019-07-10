package hw4series;

import java.util.Scanner;

public class ScannerLengthAndWidth {

	public static void main(String[] args) {
		
		int length, width;
		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter the length");
		length=kevin.nextInt();
		System.out.println("Please enter the width");
		width=kevin.nextInt();
		
	if (length==18) {
		System.out.println("The shape of your object is rectangle");
		
	}else {
		System.out.println("The shape of your object is aquare");
		
	}
		
	}

}
