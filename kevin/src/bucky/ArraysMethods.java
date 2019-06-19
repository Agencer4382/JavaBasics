package bucky;

public class ArraysMethods {

	public static void main(String[] args) {

		int[] ary = { 3, 4, 5, 6, 7, 56 };

		change(ary);
		for (int y : ary) {
			System.out.println(y);
		}

	}

	public static void change(int[] x) {

		for (int count = 0; count < x.length; count++) {

			x[count] += 4;
		}
	}
}
