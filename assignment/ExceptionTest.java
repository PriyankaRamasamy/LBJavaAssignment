package com.lionbridge.training.assignment;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw new ExceptionC();			
		}
		catch(ExceptionA exception1) {
			System.out.println("First exception subclass caught");
		}
		try {
			throw new ExceptionB();
		}
		catch(ExceptionA exception2) {
			System.out.println("Second exception subclass caught");
		}
		
	}

}
class ExceptionA extends Exception{

}
class ExceptionB extends ExceptionA{
	
}
class ExceptionC extends ExceptionB{

}

