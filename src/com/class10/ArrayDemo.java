package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] nums=new int [4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find # of element inside  an array we use .length 
		System.out.println(nums.length);
		String [] array= {"Winter","Fall","Summer","Spring"};
		//i was born in summer
		System.out.println("I Was born in"+array [2]);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
	}

}
