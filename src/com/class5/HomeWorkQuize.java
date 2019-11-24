package com.class5;

import java.util.Scanner;

public class HomeWorkQuize {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter quiz score");
		int score = scan.nextInt();
		System.out.println("enter middle score");
		int score1 = scan.nextInt();
		System.out.println("enter final score");
		int score2 = scan.nextInt();
		int averageScore = ((score + score1 + score2) / 3);
		if (averageScore >= 90) {
			System.out.println("your grade is A");
		} else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("yor garade is B");
		} else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("your grade is C");
		} else if (averageScore < 50) {
			System.out.println(" your garde is F");

		}

	}

}
