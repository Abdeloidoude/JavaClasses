package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");

		int age = scan.nextInt();
		if (age >= 1 && age <= 3) {
			System.out.println("you are a baby");
		} else if (age >= 3 && age <= 5) {
			System.out.println("you are a toddler");
		} else if (age >= 5 && age <= 12) {
			System.out.println("you are kid");
		} else if (age >= 12 && age <= 19) {
			System.out.println("you are an teenager");
		} else if (age > 20) {
			System.out.println("you are an adult");
		} else {
			System.out.println("invalid");
		}

	}
}