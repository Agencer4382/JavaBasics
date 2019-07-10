package march2;

import java.util.Scanner;

public class NestedIfQuiz {

	public static void main(String[] args) {
		// avgScore=(quiz+mid term+final scores)

		double quiz, midTerm, finalScore;
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter quiz grade");
		quiz = kevin.nextDouble();
		System.out.println("enter mid score");
		midTerm = kevin.nextDouble();
		System.out.println("final");
		finalScore = kevin.nextDouble();
		double result = ((quiz + midTerm + finalScore) / 3);
		System.out.println("average score is "+result);

		if (result >= 90)
			System.out.println("grade A");
		 else if (result >= 70 || result < 90) 
			System.out.println("grade B");
		 else if (result >= 50 && result <= 70)
			System.out.println("garde C");
		 else if (result < 50) 
			System.out.println("garde f");
		 else 
			System.out.println("nop");
		

	}

}
