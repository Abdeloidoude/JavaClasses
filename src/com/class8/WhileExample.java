package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		  /*let's ask user to enter if it is raining or not(true or false)
         * as long as there is rain let's keep asking
         * as soon as there is no rain --->you can go the park
         *
         */
        
        Scanner scan;
        boolean isRain;
        scan=new Scanner(System.in);
        
        do {
            
            System.out.println("is it raining?");
            isRain=scan.nextBoolean();
        }while(isRain);
        
        System.out.println("Go to the park");
        
	}

}
