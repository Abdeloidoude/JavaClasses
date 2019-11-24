package com.class16;

public class IQ3 {

	public static void main(String[] args) {
		
	       String given="Welcome to the java class";
	        /*to reverse String
	         * Split();
	         * Step1:split-->array of String
	         * step2:use for loop and use decrement
	         * Step2:use for loop and use decrement to print value
	         */
	        String reversed="";
	        String[] str=given.split("\\s");
	        for(int j=str.length-1;j>=0;j--) {
	            reversed=reversed+str[j]+" ";
	        }
	        
	        System.out.println(reversed);
	        //toCharArray() to reverse a string
	        
	        String given1="Today is Java Class";
	        String replaced1="";
	        char[] charArray=given1.toCharArray();
	        for(int i=charArray.length-1;i>=0;i--) {
	            replaced1=replaced1+charArray[i];
	            
	        }
	        System.out.print(replaced1);
	        
	        
	        
	        System.out.println("Using chaarAt");
	         String word3="I love Java";
	         for(int i=word3.length()-1;i>=0;i--) {
	             System.out.print(word3.charAt(i));
	             }
	        
	        
	}

}
