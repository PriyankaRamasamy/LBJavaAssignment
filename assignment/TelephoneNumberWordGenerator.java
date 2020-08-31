package com.lionbridge.training.assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
	String phoneNumber;
    char numberLetters[][] = {
            {'0','0','0'},{'1','1','1'},{'A','B','C'},
            {'D','E','F'},{'G','H','I'},{'J','K','L'},
            {'M','N','O'},{'P','R','S'},
            {'T','U','V'},{'W','X','Y'}};
    Scanner input=new Scanner(System.in);
    ObjectOutputStream output;
    PrintStream printStream;
    char[] word=new char[7];
    public void openFile() {
    	try {
    		output=new ObjectOutputStream(new FileOutputStream("Phonenumber.txt"));
    	}
    	catch(IOException ioException) {
    		System.out.println("Error in opening File");
    	}
    }
    public void addFileInfo() {
    	try {
    		char[] characters=phoneNumber.toCharArray();
    		int[] digit=new int[characters.length];
    		for(int i=0;i<characters.length;i++) {
    			digit[i]=Integer.parseInt(String.valueOf(characters[i]));
    		}
    		printStream=new PrintStream(output);
    		printStream.println("\n");
    		for(int level=0;level<3;level++) {
    			word[0]=numberLetters[digit[0]][level];
    			for(int level1=0;level1<3;level1++) {
        			word[1]=numberLetters[digit[1]][level1];
        			for(int level2=0;level2<3;level2++) {
            			word[2]=numberLetters[digit[2]][level2];
            			for(int level3=0;level3<3;level3++) {
                			word[3]=numberLetters[digit[3]][level3];
                			for(int level4=0;level4<3;level4++) {
                    			word[4]=numberLetters[digit[4]][level4];
                    			for(int level5=0;level5<3;level5++) {
                        			word[5]=numberLetters[digit[5]][level5];
                        			for(int level6=0;level6<3;level6++) {
                            			word[6]=numberLetters[digit[6]][level6];
                            			printStream.print(word);
                        			}
                    			}
                			}
            			}
        			}
    			}
                			
    		}
    		System.out.println("File written");
    		System.exit(1);
    	}				
    	catch(Exception exception){
    		System.out.println("Error writing to file");
    		System.exit(1);
    		
    	}
    }
    public void closeFile() {
    	try {
    		if(output!=null) {
    			output.close();
    		}
    	}
    	catch(IOException ioException) {
    		System.out.println("Error closing file");
    		System.exit(1);
    	}
    }
public void getPhoneNumber() {
	 System.out.println("Enter a seven-digit telephone number: ");
     phoneNumber = input.next();
	}

public static void main(String[] args) {
	TelephoneNumberWordGenerator wordGenerator=new TelephoneNumberWordGenerator();
	wordGenerator.getPhoneNumber();
}
}