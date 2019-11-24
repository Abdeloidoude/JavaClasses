package com.class12;

public class StringManiPulationDemo {

	public static void main(String[] args) {
		 //There are two ways to create string objects.
		//1
		// String Literal
		String name=("Jhon");
		System.out.println(name);
		System.out.println("The length of name is= "+name.length());
		//2
		//Creating String With new Key word
		String name1=new String ("john1");
		System.out.println(name1);
		/*
		 * this method returns the length of this string.
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		int name1Len=name1.length();
        System.out.println("the length of name1Len"+name1Len);
        
        //String is immutable class you cannot change the value
        String str1="HelLo woRld";
        System.out.println("Before::"+str1);
        str1= str1.toLowerCase();
        System.out.println("After::"+str1);
        
        
        //.equals()
        String str2="HEllo WoRld";
        boolean isEqual=str1.contentEquals(str2);
        System.out.println(isEqual);
        
        //.equalsIgnoreCase();
        //this method does not care for capitalization and compare the 
        //content only
        System.out.println(str1.equalsIgnoreCase(str2));
        /*
         * toUppercase();
         * this method converts all of the characters in
         * this String to uppercase
         */
        String str3="Mohammad";
        System.out.println("Before ::"+str3);
        str3=str3.toUpperCase();
        System.out.println("After::"+str3);
        
        
        
        
        
        
        
	}


}

