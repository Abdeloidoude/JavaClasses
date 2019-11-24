package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
          for (int i=5; i>=1; i--) {
        	  for (int j=1;j<=i; j++) {
        		  System.out.print(i);
        		  
        	  }
        	  System.out.println();
        	  
          }
          
          for (int i=5; i>=1; i--) {
        	  for (int j=1;j<=i; j++) {
        		  System.out.print("*");
        		  
        	  }
        	  System.out.println();
          }
          for (int i=4; i>=1; i--) {
        	  for (int j=1;j<=i; j++) {
        		  System.out.print("*");
        		  
        	  }
        	  System.out.println();
          }
	}
	

}
