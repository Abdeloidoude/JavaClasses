package com.class16;

public class IQ7 {

	   // prime
    public static void main(String[] args) {
        /*
         */
        // take range of numbers from 2 to 100 and print all prime
        // 2,3 (2,3),4(2,3,4),5(2,3,4,5),6(2,3,4,5,6)
        int num = 5;
        boolean isPrime = true;
        if (num<=1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is Not prime number");
        }
    }
}
	
