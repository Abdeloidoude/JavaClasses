package com.class5;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b1 = !true;
		boolean b2 = !false;
		System.out.println(b1);
		System.out.println(b2);
		boolean traffic = !true;
		if (!traffic) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		boolean isRain = false;
		if (!isRain) {
			System.out.println("do not take an umbrella");

			int num1 = 10;
			int num2 = 10;
			if (num1 == num2) {
				System.out.println("Numbers are equal");
			} else {
				System.out.println("Numbers are not equal");
			}
			if (!(num1 == num2)) {
				System.out.println("Numbers are not equal");
			} else {
				System.out.println("Numbers are equal");
				// if name is not marry or Anna then you are not my sister
				String name = "Mary";
				String name2 = "July";
				if (!(name.equals("Mary") || name2.equals("Anna"))) {
					System.out.println("you are not my sister");
				} else {
					System.out.println("you are my sister");
				}

			}
		}
	}
}