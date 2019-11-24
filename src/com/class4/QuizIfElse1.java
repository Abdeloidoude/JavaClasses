package com.class4;

public class QuizIfElse1 {
	 public static void main(String[] args) {
		
	
	 
	
	double rate = 2.5;
    int price = 20000;
    if (rate >= 4.5) {
        System.out.println(" I am Not buying a house");
    } else {
        System.out.println("I will Consider buying a house");
        if (price >200000) {
            System.out.println("I am taking a loan to buy a house");
        } else {
            System.out.println("I will pay with cash for house");
        }

}
}
}
