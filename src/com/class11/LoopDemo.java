package com.class11;

public class LoopDemo {

	public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 5; i++) {
            System.out.println("How are you?");
        }
        // for(;;) { infinite loop
        // System.out.println("Hello");
        // }
       System.out.println("--------------------------------------------------------------");
        int[] numbersList = { 2, 3, 5, 7 };
        for (int element :numbersList) { // only for array and collection only (advanced loop, for each loop , enhanced loop)
            System.out.println(element);
            // you can put primitive and non primitive and use defined variable
        }
        
        
        
        
    }
}
