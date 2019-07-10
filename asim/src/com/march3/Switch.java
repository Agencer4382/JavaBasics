package com.march3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

	int fnum;
	int snum;
	int result=0;
	
	Scanner kevin= new Scanner(System.in);
	System.out.println("enter fnum");
	fnum=kevin.nextInt();
	System.out.println("enter snum");
	snum=kevin.nextInt();
	System.out.println("enter char operator(-,*,/,+):");
	char operator=kevin.next().charAt(0);
	
	switch (operator) {
	case '+':
		result=fnum+snum;
		break;
	case '-':
		result=fnum-snum;
		break;
	case '*':
		result=fnum*snum;
		break;
	case '/':
		result=fnum/snum;
		break;
		
		default:
			System.out.println("no out put");
		
	}
	System.out.println(fnum+""+operator+""+snum+"="+result);
	
	
	}

}
