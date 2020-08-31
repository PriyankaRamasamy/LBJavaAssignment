package com.lionbridge.training.assignment;

public class oneDimensionalArrayOperation {

	public static void main(String[] args) {
		//Set the 10 elements of integer array counts to zero
		int setZero[]= {0,0,0,0,0,0,0,0,0,0};
		//Add one to each of the 15 elements of integer array bonus
		int arrayBonus[]=new int[15];
		for(int i=0;i<arrayBonus.length;i++) {
			arrayBonus[i]=arrayBonus[i]+1;
		}
		//Display the five values of integer array bestScores in column format
		int bestScore[]= {1000,2000,3050,4030,5010};
		for(int j=0;j<bestScore.length;j++)
		{
		 System.out.printf("%d \t",bestScore[j]);	
		}	
	}

}
