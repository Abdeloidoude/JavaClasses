package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		  /*Step1:reverse the string
	     * Step2: compare the String:
	     *     if strings are equal-->palindrome
	     *     else-->not palindrome
	     */ 
	        String original="kayak";
	        String reversed="";
	        //5-1=4-1
	        
	        for(int i=original.length()-1;i>=0;i--) {
	            reversed=reversed+original.charAt(i);//""+k=k+a=ka+k
	        }
	        System.out.println(reversed);
	        
	        if(original.equals(reversed)) {
	            System.out.println("String is Palindrom");
	        }else {
	            System.out.println("String is NOT palindrom");
	        }
	        
		 
	}

}
