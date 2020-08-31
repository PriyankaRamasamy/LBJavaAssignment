package com.lionbridge.training.assignment;

import java.util.Scanner;

public class StringComparsion {

	public static void main(String[] args) {
		String firstString,secondString;
		int comparsionValue;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first String");
		firstString=input.next();
		System.out.println("Enter the second String");
		secondString=input.next();
		comparsionValue=firstString.compareTo(secondString);
	//System.out.println(comparsionValue);
		if(comparsionValue==0) {
			System.out.printf("%s First String and Second String %s are equal",firstString,secondString);
		}else if(comparsionValue < 0) {
			System.out.printf("%s First String is greater than Second String %s",firstString,secondString);
		}else if(comparsionValue > 0){
			System.out.printf("%s First String is lesser than Second String %s",firstString,secondString);
		}
		
	}

}
