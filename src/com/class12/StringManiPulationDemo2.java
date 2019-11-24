package com.class12;

public class StringManiPulationDemo2 {

	public static void main(String[] args) {
		/*
		 * .contains();
		 *This method searches the sequence of characters in the string.
		 *if the sequence of characters are found,
		 *then it return true otherwise returns false.
		 */
		 
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		System.out.println(sentence.contains ("was"));
		
		String s="snow";
		String c="WIND";
		System.out.println(s.length());
		System.out.println(s.contentEquals(c));
		System.out.println(s.contains(c));
		System.out.println(s.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(s.equalsIgnoreCase(c));
		        // Create two Strings and initialize them with some value.
		        //implement the following methods on those strings.
		        
		        /*
		         * sen.length();
		         * sen.equals();
		         * sen.contains(s);
		         * sen.toUpperCase();
		         * sen.toLowerCase();
		         * sen.equalsIgnoreCase(anotherString);
		         */
		        
		        System.out.println("****************");
		        /*
		         * This method tests if a string starts with the
		         * specified prefix beginning
		         */
		        String str2="It is very hot in the class";
		        System.out.println("Is this string starts with="+str2.startsWith("It"));
		        //System.out.println(“Is this string starts with=“+str2.startsWith(“is”, 3));
		        System.out.println("****************");
		        
		        /*
		         * This method tests if this string ends with
		         * the specified suffix.
		         */
		        System.out.println("Is this string ends with="+str2.endsWith("class"));
		
}
}