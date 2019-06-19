package bucky;

public class MethodsTableMulti {

	public static void main(String[] args) {

		int[][] firstary = { { 10, 12, 17 }, { 54, 4, 52, 76 }, { 90, 45 } };
		int[][] secary = { { 9, 13, 1 }, { 34, 6 }, { 127 }, { 50, 25 } };
		System.out.println("The first array is: ");
		display(firstary);
		System.out.println("The second array is: ");
		display(secary);

	}

	public static void display(int[][] x) {

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {

				System.out.print(x[row][col] + "\t");

			}
			System.out.println();
		}
	}

}
