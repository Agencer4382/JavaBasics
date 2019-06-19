package StringRepl;

import java.util.Scanner;

public class Repl74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String language;
		char c ='C';
		String a = "C++";
		String b="java";
		System.out.println("Enter any programming language");
		language = sc.nextLine();

		if (language.equals(b)) {
			System.out.println("Java is a programming language.");
		}
			
		else if (language.equals(c)) {
				System.out.println("C is a procedural programming language");
			}
				
		else if (language.equals(a)) {
					System.out.println("C++ is a middle-level programming language");
				}
			
	else {
		System.out.println("Doesn't match any programming language");
			}
		
	}
			
		}
		




