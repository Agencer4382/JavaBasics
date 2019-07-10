package march2;
import java.util.Scanner;

public class NestedIfAge {

	public static void main(String[] args) {
		//ask user age enter the age
		//age>1 and age<3...baby
		//age>3 and age<5....taddler
		//age>5 and age<13...kid
		//age>13 and age<20...teenager
		//age>20 and age<64...adult
		//older and equal 64...senior
		
		Scanner kevin;
		int age;
		
		kevin=new Scanner(System.in);
		System.out.println("enter your age");
		age=kevin.nextInt();
		
		if (age>=1 && age<3) {
			System.out.println("enter your age");
		
		}else if (age>=3 && age<5) {
			System.out.println("toddler");
			
		}else if (age>=5 && age<13) {
			System.out.println("kid");
			
		}else if (age>=13 && age<20) {
			System.out.println("teenager");
	}else if (age>=20 && age<64) {
		System.out.println("adult");
		
		
	}else if (age==64) {
		System.out.println("senior");
	}
}
}