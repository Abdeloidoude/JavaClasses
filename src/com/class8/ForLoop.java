package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// say good morning 5 times
		// initialize; test condition; increment

		for (int i = 0; i <= 4; i++) {
			System.out.println("Good morning");
		}
		// print numbers from 1-10;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// print numbers from 10-1
			for (int i= 10; i >= 1; i--) {
				System.out.println(i);
			}
				for (int i = 0; i <= 50; i += 5) {
					System.out.println(i); // 5,10,15,20
				}	
				for (int i =1; i<100; i++) {
						System.out.print(" "+i);
				}
						for (int n=100; n>1; n-- ) {
							System.out.println(n);
						}
							
							for (int r=20; r>=1;  r --) {
								if (r%2==0 )
								System.out.println(r);
							}
								
								for ( int s=50; s>=20; s--) {
									if (s%2!=0) 
										System.out.println(s);
								}
									}

}
