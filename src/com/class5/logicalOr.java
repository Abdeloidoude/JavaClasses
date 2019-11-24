package com.class5;

public class logicalOr {

	public static void main(String[] args) {

		// 7 days a week
		// if days is 2 or 4 --> SDLC class
		// if day6 or 7--> Java Class
		// if day 1 or 5 --> no class
		// if day=3--> review class

		int day = 6;
		// false or false --> false
		if (day == 2 || day == 4) {
			System.out.println("SDLC Class");
			// true or false -->true
		} else if (day == 6 || day == 7) {
			System.out.println("java class");
			// false or false --> false
		} else if (day == 3) {
			System.out.println("review class");
		} else {
			System.out.println("not valid class");

			// 7 days a week
			// if days is Tuesday or Thursday-->SDLC class
			// if day Saturday or Sunday-->java class
			// if day Wednesday -->review class
			String weekDay = "Monday";

			if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
				System.out.println("SDLC class");
			} else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
				System.out.println("Java class");
			} else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
				System.out.println("no class");
			} else if (weekDay.equals("Wednesday")) {
				System.out.println("review class");
				
			} else {
				System.out.println("not a valid day");
				// 7 days a week
				// if days is Tuesday or Thursday--> SDLC class
				// if day saturday or sunday --> Java Class
				// if day monday or friday --> No class
				// if day is wednesday --> review class//

				
				}
			}

		}
	}


