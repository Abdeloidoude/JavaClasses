package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner Keyboard=new Scanner (System.in);
		System.out.println("please enter first number");
		int num1=Keyboard.nextInt();
		System.out.println(" please enter second number");
		int num2=Keyboard.nextInt();
		if (num1>num2) {
			System.out.println(num1+" is larger than " + num2);
		}else if (num1==num2) {
			System.out.println(num1 +"is equal" +num2);
		}else {
			System.out.println(num1+" is smaller than "+num2);
		

	}

	}
}
