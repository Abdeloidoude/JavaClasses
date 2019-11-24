package com.class10;

public class PracticeArray {

	public static void main(String[] args) {
		
		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(grade[1]);

		char[] Grade = new char[6];
		Grade[0] = 'A';
		Grade[1] = 'B';
		Grade[2] = 'C';
		Grade[3] = 'D';
		Grade[4] = 'E';
		Grade[5] = 'F';
		System.out.println(grade[1]);

		String[] name = { "abdel", "John", " fati", "elen" };
		System.out.println(name[0]);
		
		double[] arrayofdouble= {2.5,6.5,8.9,7.9,3.5};
		int Size=arrayofdouble.length;
		
		for (int a=0; a<Size;a++);{
		int a = 1;
		System.out.println(arrayofdouble[a]+" ");
		}
	}

}
