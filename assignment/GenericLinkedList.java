package com.lionbridge.training.assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericLinkedList {
	 

	public static void main(String[] args) {
		LinkedList <Character> characters = new LinkedList<Character>();
		characters.add('A');
		characters.add('B');
		characters.add('C');
		characters.add('D');
		characters.add('E');
		characters.add('F');
		characters.add('G');
		characters.add('H');
		characters.add('I');
		characters.add('J');
		System.out.println("First LinkedList Values :" +characters);
	 
		LinkedList<Character> reverseLinkedList = new LinkedList<Character>();
		Iterator<Character> reverseIterator = characters.descendingIterator();

		while(reverseIterator.hasNext()) {
			reverseLinkedList.add(reverseIterator.next());
		} 
		System.out.println("Reverse Linked List: "+reverseLinkedList); 
	}

}
