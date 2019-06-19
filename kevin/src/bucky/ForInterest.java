package bucky;

public class ForInterest {

	public static void main(String[] args) {
	double amount;
	double money=10000;
	double interest=1.2;
	
	for (int year=1; year<=4; year++) {
		amount=money*Math.pow(1+interest, year);
		System.out.println(year+" "+amount);
	}
	}

}
