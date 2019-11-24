package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {

		/*
		 * ask user wher they are from based on the contry we will specify favorite food
		 */
		/*
		 * ask user where they are from based on the country we will specify favorite
		 * food
		 */
		String country, foodName;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Please Enter your country");
		country = scan.nextLine();

		switch (country) {

		case "Turkey":
			foodName = "kebab";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		case "Morocco":
			foodName = "Tajine";
			break;
		case "Kazakhstan":
			foodName = "Kumis";
			break;
		case "Pakistan":
			foodName = "Beryani";
			break;
		case "Russia":
			foodName = "Caviar";
			break;
		case "Cuba":
			foodName = "Sofrito";
			break;
		default:
			foodName = "Unknown";
		}

		System.out.println("You are from " + country + " and you favorite food is " + foodName);
	}

}
