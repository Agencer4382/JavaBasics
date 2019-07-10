package hw4series;
import java.util.Scanner;


public class ScannerAge {

	public static void main(String[] args) {
		int age;
		
		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter your age ");
		age=kevin.nextInt();
		if (age>=18) {
			System.out.println("You are eligible to vote");
			
		}else {
			System.out.println("you are not eligible to vote");
		}

	}

}
