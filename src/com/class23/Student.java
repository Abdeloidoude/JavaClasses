package com.class23;

public class Student {
	String name;
	int grade1,grade2,grade3;
	Student(String studentName,int gr1,int gr2,int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		
}
	 public static void main(String[] args) {
		 Student student1=new Student("John",90,78,100);
		 student1.calculateAverage();
		
	}
	private void calculateAverage() {
		// TODO Auto-generated method stub
		
	}
}
