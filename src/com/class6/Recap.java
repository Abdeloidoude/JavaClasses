package com.class6;

public class Recap {

	public static void main(String[] args) {
		
	    /*declare the time(1-24
         * based on the time identify whther it mormning, afternoon, evening or night
         * it 1-2-->morning
         * if 12-15-->noon
         * if 16-20-->evening
         * if >20-->night
         *
         */
        
        int time=10;
        String timeOfDay;
        
        if(time>=1 && time<=11) {
            timeOfDay="Morning";
            
        }else if(time>=12 && time<=15) {
            timeOfDay="Noon";
        }else if(time>=16&& time<=20) {
            timeOfDay="Evening";
        }else if(time>20) {
            timeOfDay="Night";
        }else {
            timeOfDay="Invalid";
        }
        System.out.println("Time of the day is "+ timeOfDay);
        if(timeOfDay.equals("Morning")) {
            System.out.println("Good Morning");
        }
    }


}
	


