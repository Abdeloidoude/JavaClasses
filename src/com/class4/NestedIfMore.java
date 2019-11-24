package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {

		/*
		 * check age ,if age is less than 16--> you are too young to drive otherwise
		 * -->we are eligible to drive & we will check you are older than 18 you can get
		 * driver license and if not you can get driver permit
		 */

		int age = 15;
		if (age < 16) {
			System.out.println("you are too young to drive");
		} else {
			System.out.println(" you are elgible to drive");
			if (age >= 18) {
				System.out.println(" you can drive alone");
			} else {
				
				System.out.println("you need your parent to dive");
			}
		}
	}

}
