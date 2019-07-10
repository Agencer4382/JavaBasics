package hw4series;
import java.util.Scanner;
public class ScannerEquals {

	public static void main(String[] args) {
	
		String name;
		Scanner kevin = new Scanner(System.in);
		name=kevin.nextLine();
		
		if (name.contentEquals("Chen")) {
			System.out.println("teacher");
			
		}else {
			System.out.println("student");
		}
	}

}
