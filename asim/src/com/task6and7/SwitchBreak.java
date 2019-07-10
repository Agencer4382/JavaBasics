package com.task6and7;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {

		String name;
		String activity;
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter name of the instructor");
		name = kevin.nextLine();

		switch (name) {
		case "Shiva":
			activity = "Will take care of Java Assignment";
			break;
        case "Sandish":
			activity = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			activity = "Will take care of Selenium Assignment";
			break;
		case "Asel":
			activity = "Will take care of every Assignment";
			break;
			default:
			activity=" Invalid instructor selected";
			
		}
		System.out.println(activity);
			 
			
	}

}
