package com.class6;

import java.util.Scanner;

public class SwitshAndScanner {

	public static void main(String[] args) {
	
		        /*Ask user to enter their gender F or M
		         * Based on the input provide
		         * if F--->Female
		         * if M-->Male
		         * otherwise-->unknown
		         */
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Pleasee enter your gender:F or M");
		        char gender=scan.next().charAt(0);
		        String userGender;
		        switch (gender) {
		        
		        case 'F':
		          userGender="Female";
		          break;
		        case 'M':
		            userGender="Male";
		            break;
		        default:
		            userGender="Unkown";
		          }
		        
		        System.out.println("Your gender is "+ userGender);
		    }

	}


