package com.lionbridge.training.assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TelephoneNumberTokenizing {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Phone Number in the following format (444)-444-4444");
		System.out.println("Enter the Phone Number :");
		String phoneNumber=input.nextLine();
		StringTokenizer tokenizer=new StringTokenizer(phoneNumber);
		String areaCode=tokenizer.nextToken("()");
		String number=tokenizer.nextToken(")-")+tokenizer.nextToken("-");
		System.out.printf("Area Code: %s \nPhone Number:%s\n",areaCode,number);
	}
}
