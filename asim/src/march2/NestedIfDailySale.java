package march2;

import java.util.Scanner;

public class NestedIfDailySale {

	public static void main(String[] args) {
		// enter daily sales
		// based on the sales range commission=2
		// sales is <100--->2
		// sales more than 100 and less than 200--->5

		int sales;
		int commission;
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter daily sales");
		sales = kevin.nextInt();

		if (sales > 0 && sales < 100) {
			commission = 2;

		} else if (sales >= 100 && sales < 200) {
			commission = 5;

		} else if (sales >= 200 && sales < 500) {
			commission = 10;

		} else if (sales >= 500) {
			commission = 20;
		} else {
			commission = 0;
			
		}
		System.out.println("your commission " + commission);

	}

}
