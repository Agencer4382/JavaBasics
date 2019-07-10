package hw4series;

import java.util.Scanner;

public class ScannerFnumSnum {

	public static void main(String[] args) {
		int x,y;
		
		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = kevin.nextInt();
		System.out.println("Please enter second number");
		y=kevin.nextInt();
		int ans=x*y;
		if (ans > 0) {
			System.out.println("True");

		} else {
			System.out.println("false");
		}

	}

}
