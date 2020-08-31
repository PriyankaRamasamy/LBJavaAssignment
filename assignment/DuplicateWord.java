package com.lionbridge.training.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		System.out.print("Enter string to analyse:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");
        Map<String,String> wordMap = new HashMap<String,String>();
        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); 
            if(wordMap.get(word)!=null) {
                System.out.println("Duplicated/Repeated word:"+word);
            }else {
                wordMap.put(word, word);
            }
        
        }

	}

}
