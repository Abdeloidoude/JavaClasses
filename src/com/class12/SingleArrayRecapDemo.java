package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
	  
	        int [] array1=new int[4];
	        array1[0]=12;
	        array1[1]=13;
	        array1[2]=14;
	        array1[3]=14;
	        
	        int [] array2= {2,5,4,7};
	        
	        
	        
	        
	        
	        int num1=0;
	    // System.out.println(array1[1])
	        for (int s = 0; s < array1.length; s++) {
	            
	            num1=num1+array1[s];
	            System.out.println(array1[s]);    
	        }    
	        System.out.println("the sum of Array1 is="+num1);
	        System.out.println("--------------------------");
	        for(int i:array2) {
	            System.out.println(i);
	            
	        }
		
		
	}		
	

}
