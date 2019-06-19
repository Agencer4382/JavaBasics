package bucky;

import java.util.Scanner;

public class SetName {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Tuna tunaObject = new Tuna();
		System.out.println("enter fg name here: ");
		String a = input.nextLine();
		// tunaObject.girlName = a;
		tunaObject.setName(a);
		tunaObject.saying();

	}
}
