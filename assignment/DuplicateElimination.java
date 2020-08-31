package com.lionbridge.training.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

	public static void main(String[] args) {
		ArrayList<Integer> eliminateDuplicateList=new ArrayList<Integer>();
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	    int arrayLength=input.nextInt();
	    
		int userInput[]=new int[arrayLength];     
        System.out.println("Enter all the elements:");
        for(int i = 0; i < arrayLength; i++)
        {
        		 userInput[i] = input.nextInt();
        		 if(userInput[i]>=10 && userInput[i]<=100) {
                		 }else {
                			 //throws an warning and ask user to enter the value between the range
        			 System.out.println("Enter the number between 10 and 100");
        			 userInput[i] = input.nextInt();
        		 }
        	}
        for (int i = 0; i < userInput.length; i++) { 
			  if(!eliminateDuplicateList.contains(userInput[i]))
			  {
				  eliminateDuplicateList.add(userInput[i]);
			  }
      }
		System.out.println("Unique Values are"+eliminateDuplicateList);
	}
        //System.out.println(Arrays.toString(userInput));              
}
