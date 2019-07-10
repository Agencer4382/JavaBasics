package march2;

import java.util.Scanner;

public class NestedIfPrice {

	public static void main(String[] args) {
		// user enter price and boolean value for sale
		// based on the sale we will check the price
		// if price<20-->discount 20% and give final price
		// if price>20-->less 100 discount 30% and give final price
		// if price>100-->less 500 discount 50% and give final price

		boolean sale;
		int discount;
		int price;
		double finalPrice;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter there is sale");
		sale = kevin.nextBoolean();

		if (sale) {
			System.out.println("enter price of the item");
			price = kevin.nextInt();

			System.out.println("check all the discount");
			if (price < 20) {
				discount = 20;
				finalPrice = price - (price * 0.2);

			} else if (price >= 20 && price < 100) {
				discount = 30;
				finalPrice = price - (price * 0.3);

			} else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
			} else {
				discount = 75;
				finalPrice = price - (price * 0.75);
			}

		} else {
			System.out.println("not interest");

		}
	}
}
