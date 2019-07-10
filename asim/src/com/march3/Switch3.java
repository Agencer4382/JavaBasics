package com.march3;

public class Switch3 {

	public static void main(String[] args) {
		
		int day=7;
		String dayName;
		
		switch (day) {
		case 1:
			dayName="monday";
			break;
		case 2:
			dayName="tuesday";
			break;
		case 3:
			dayName="wednesday";
			break;
		case 4:
			dayName="thursday";
			break;
		case 5:
			dayName="friday";
			break;
		case 6:
			dayName="saturday";
			break;
		case 7:
			dayName="sunday";
			break;
			default :
				dayName="invalid";
				
		}
			System.out.println("today is "+dayName);
		
	}

}
