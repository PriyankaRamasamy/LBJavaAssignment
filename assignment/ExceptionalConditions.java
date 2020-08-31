package com.lionbridge.training.assignment;

public class ExceptionalConditions {

	public static void main(String[] args) {
		  try{
			  System.out.println("Pass the value to the variable Number");
			  System.out.println("---****------******-----*****------****");
			  int number=Integer.parseInt("abc");	   
		     }
		  catch(NumberFormatException numberException) { 
	          System.out.println("Warning: Number format exception,enter the number instead of string \n"); 
	          } 
		  try {
			  System.out.println("Divide the number");
			  System.out.println("---****------******-----*****------****");
			  int divide=100/0;
		  }
		  catch(ArithmeticException arithmeticException){
			  System.out.println("Warning: ArithmeticException,can't divide any number by zero \n");
			  }
		  try {
			  System.out.println("Pass the value to the Array");
			  System.out.println("---****------******-----*****------****");
			  int array[]=new int[3];
			  array[4]=5;
			  
		  }
		  catch(ArrayIndexOutOfBoundsException arrayOutofBoundException){
		      System.out.println("Warning: ArrayIndexOutOfBoundsException,enter the value to the specified length \n");
		      }
		  
		  catch(Exception exception){
		      System.out.println("Warning: Some Other exception");
		      }	 
		  }
}
