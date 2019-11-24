package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		/* you need to ask user to pay for coffee
		 * you need to keep asking user to pay for it until
		 * entered price is equal=5;
		 * After user paid then say ("enjoy your coffee")
		 */
		 int price=0;
		 while (price!=5){
			System.out.println("please pay for coffee"); 
		Scanner scan=new Scanner(System.in);
		price=scan.nextInt();}
	    System.out.println("enjoy your coffee");
			
		}
	}



