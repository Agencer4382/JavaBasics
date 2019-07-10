package march2;
import java.util.Scanner;


public class NestedIfClassified {

	public static void main(String[] args) {
		//promt the user to enter 2 people heights in inches each person classified following
		//-short(under5feet)/medium(5to6)/tall(6 feet and over)
		
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter heg");
		
		double heg;
		double heg1;
		heg=kevin.nextDouble();
		System.out.println("enter heg1");
		heg1=kevin.nextDouble();
		
		
		if (heg<=5 && heg1<=5) {
			System.out.println("short");
		}else if (heg==5 || heg1<=6 ) {
			System.out.println("medium");
		}else if(heg>6 && heg1>6) {
			System.out.println("tall");
				
		}else {
			System.out.println("there is nothing");
		}

	}

}
