package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner input1=new Scanner(System.in);
		System.out.println(" do you have a credit card? true or false");
		boolean cc=input1.nextBoolean();
		if(cc) {
			System.out.println("what is the balance on your card");
			
			int balance=input1.nextInt();
			if (balance>1000) {
				System.out.println("please pay off your balance");
			}else {
				
				System.out.println("you can spend more money");
				
			}
		}
		
		else {
			System.out.println("would you like to apply for credit card");
		}
		
	}

}
