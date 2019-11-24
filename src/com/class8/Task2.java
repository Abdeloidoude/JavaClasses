package com.class8;

public class Task2 {

	public static void main(String[] args) {
		
		/* write a code to find the sum of even & odd numbers 
		 * from range 1to 20
		 * expecting 2 outputs
		 * sum for odd nums=..
		 * sum for even nums=..
		 */
		int SumEven =0;
		int SumOdd=0;
		
		for (int r=1;r<=20;r++){
			if (r%2==0) {
				
				SumEven =SumEven +r;
				} else {
					SumOdd = SumOdd+r;
					}
			}
		System.out.println("The total of all even#=" + SumEven);
		System.out.println("The total of all odd#=" + SumOdd);
		}
	
			
				
			
		
	}


