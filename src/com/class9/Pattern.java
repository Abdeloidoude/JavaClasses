package com.class9;

public class Pattern {
	public static void main(String[] args) {
		// *****
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		// *****
		// *****
		// *****
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		// *****--> rows
		// *****
		// *****
		// *****
		for (int k = 1; k <= 4; k++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// *******
		// *******
		// *******
		// *******
		// *******
		for (int s = 0; s < 10; s++) {// rows
			for (int y = 0; y < 10; y++) {// cols

				System.out.print("*");
			}
			System.out.println();
		}
		// print
		/*
		 * 12345 12345 12345 12345
		 */
		for (int d = 1; d < 5; d++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 * 11111 22222 33333 44444 55555
		 */
		System.out.println("--------------------");
		for (int n = 1; n <= 5; n++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
		/*
		 * 123456789 123456789 123456789 123456789 123456789
		 */
		System.out.println("--------------------");
		/*
		 * 54321 54321 54321 54321 54321
		 */
		for (int G = 1; G >= 5; G++) {
			for (int j=5; j >= 1; j--) {
				System.out.print(G);
			}
			System.out.println();
		}
		System.out.println("--------------------");
		/*
		 * 55555 44444 33333 22222 11111
		 */

		for (int t = 5; t > 0; t--) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(t);
			}
			System.out.println();
		}

	}

}
