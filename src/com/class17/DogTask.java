package com.class17;

public class DogTask {
	    String name;
		String Type;
		String brand;
		void play() {
			System.out.println("Ican play with my " + name);
		}
		void pet() {
			System.out.println("I can do plenty things with my "+brand);
		}
		void Watch() {
			System.out.println("I can watch my " + Type+ " runing");
		}
		public static void main(String[] args) {
		    DogTask com= new DogTask();
			com.name="Labrador";
			com.brand= "Bulldog";
			com.Type= "Husky";
			com.pet();
			System.out.println("I have " + com.brand + " is black");
			com.Watch();
			System.out.println("playing whith " + com.Type+ " is fun");
			com.play();
			System.out.println("The color of " + com.name+ " is brown");
		
			
		}
	
	
}


	


