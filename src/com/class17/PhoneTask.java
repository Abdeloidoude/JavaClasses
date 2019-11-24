package com.class17;

public class PhoneTask {
	

	String brand;
	String year,Giga;
	void Alarm(){
		System.out.println("My phone is a " +brand);
	}
	void sound() {
		System.out.println("This phone is a "+Giga);
	}
	void fast() {
		System.out.println("I have this phone since 2002 it brand is " +year);
	}
	
	public static void main(String[] args) {
		PhoneTask phone1=new PhoneTask();
		phone1.brand="iPhone";
		phone1.year="Nokia";
		phone1.Giga="Android";
		System.out.println("The color of my " +phone1.brand+ " is silver");
		phone1.Alarm();
		System.out.println("I can text with my " +phone1.year+ " all the time");
		phone1.sound();
		System.out.println("I take videos  pictures with my old " +phone1.Giga );
		phone1.fast();
		
		
	}	

}

