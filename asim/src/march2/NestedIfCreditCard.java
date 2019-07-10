package march2;

public class NestedIfCreditCard {

	public static void main(String[] args) {
	//if user credit card
		//what is the balance is more than 1000-->pay off
		//else "you are good"
		
		boolean creditCard=true;
		int balance=1000;
		if (creditCard) {
			System.out.println("check balance");
			
			if (balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are good");
			}
			
		}else {
			System.out.println("do you want credit card");
			
		}
	
		
	}

}
