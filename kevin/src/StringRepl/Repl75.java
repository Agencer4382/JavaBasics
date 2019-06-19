package StringRepl;

import java.util.Scanner;

public class Repl75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String browser;
		String c = "ChroME";
		String a = "fireFOX";
		String b = "Ie";
		System.out.println("Enter the browser name to proceed further with execution");
		browser = sc.nextLine();

		if (browser.equals(c)) {
			System.out.println("Proceed with chrome Browser");
		}

		else if (browser.equals(a)) {
			System.out.println("Proceed with firefox Browser");
		}

		else if (browser.equals(b)) {
			System.out.println("Proceed with ie Browser");
		}

		else {
			System.out.println("Invalid Browser");
		}
	}

}
