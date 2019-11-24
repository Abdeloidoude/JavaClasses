package com.class6;

import java.util.Scanner;

public class ClassTask {

	

		public static void main(String[] args) {
	        /* ask user to enter the month they were born
	         * based on the month define the season
	         * if user is brn in Jan, feb, dec-->winter
	         * if jun, jul, aug-->summer
	         * if sept, oct,nov -->fall
	         * otherwise-->unknown
	         * at the end of the program
	         * "you were born in___"
	         */
	        String month;
	        String Season;
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Please enter the month you were born");
	        month=scanner.nextLine();
	        
	        if(month.equals("January") || month.equals("February")||month.equals("December")) {
	            Season="winter";
	        }else if(month.equals("March") ||month.equals("April")||month.equals("May")){
	            Season="spring";
	        }else if(month.equals("June") ||month.equals("July") ||month.equals("august")) {
	            Season="Summer";
	            
	        }else if(month.equals("September") ||month.equals("October")||month.equals("November")){
	            Season="fall";
	        }else {
	            Season="Unkown";
	        }
	        
	        System.out.println("you were born in "+ Season);
	       System.out.println(month);
	}

}
