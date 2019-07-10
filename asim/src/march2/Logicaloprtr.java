package march2;

public class Logicaloprtr {

	public static void main(String[] args) {
		//if number is between 1-10.....small
		//is11-100....medium
		//101-1000....large
		
		int num=15;
		if (num>=1 && num<=10){
			System.out.println("number is small");
			
			
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
			
		}else if(num>=101 && num<=1000) {
			System.out.println("number is  large");
		}else {
			System.out.println("no number here");
		}

	}

}
