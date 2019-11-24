package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 10; i < 10; i++) {
			if (i == 2) {
				break;

			}
			System.out.println(i);
		}
		System.out.println("iam outside of the loop");
		// continue -it will skip current iteration
		for (int i = 1; i <= 5; i++)

		{
			if (i == 3 || i == 4) {
				System.out.println(i);
			}
			System.out.println("i am outside of the loop");

			for (int M = 1; M <= 50; M++) {
				if (M % 3 == 0) {

					continue;
				}
				System.out.println(M);

				System.out.println("**********************");
				// continue - it will skip CURRENT iteration
				for (int r = 1; i <= 5; r++) {
					if (r == 3 || r == 4) {
						continue;
					}
					System.out.println(r);
				}
				System.out.println("*******************");
				// I want to print nums from 1 to 20 except 5,6,7
				for (int a = 1; a <= 20; a++) {// 5
					if (a >= 5 && a <= 17) {
						continue;
						
					}
					System.out.println(a);
				}
					
				}
			}
		}
	}


