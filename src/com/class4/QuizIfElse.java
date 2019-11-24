package com.class4;

public class QuizIfElse {
	
	public static void main(String[] args) {
        boolean userDiploma = true;
        double gpa = 4.0;
        if (userDiploma) {
            System.out.println("congratulation");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You shoud have studied harder");
            }
        } else {
            System.out.println("You should get a degree");
        }
	}
}


