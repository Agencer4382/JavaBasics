package march2;

import java.util.Scanner;

public class hwnestedif {

	public static void main(String[] args) {
		int x, y, z;
		Scanner kevin = new Scanner(System.in);

		System.out.println("enter 3 distinct number");
		x = kevin.nextInt();
		y = kevin.nextInt();
		z = kevin.nextInt();
		// 5,3,4
		if (x > y)
			if (x > z)
				System.out.println(x + " is the largest number");

			else
				System.out.println(z + " is yhe largest number");

		else // assuming y>x
		if (y > z)
			System.out.println(y + " is the largest number");

		else
			System.out.println(z + " is the largest number");

	}
}