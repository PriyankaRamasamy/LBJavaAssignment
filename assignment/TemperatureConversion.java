package com.lionbridge.training.assignment;

import java.util.Scanner;

public class TemperatureConversion {
	Scanner input=new Scanner(System.in);
	public int convertIntoCelsius(int fahrenheitTemperature) {
		return ((int)(5.0 / 9.0 * (fahrenheitTemperature - 32)));
	}
	public int convertIntoFahrenheit(int celsiusTemperature) {
		return ((int)(9.0 / 5.0 *celsiusTemperature + 32));
	}	
	public void convertTemperature() {
		int conversionChoice=0;
		while(true) {
		System.out.println("\n Enter the conversionChoice of yours :");
	    conversionChoice=input.nextInt();
          if(conversionChoice==3) {
     		System.out.println("\n Please enter the input of valid choice");
     		break;
          }
		System.out.println("Enter the temperature to convert:");
		int temperatureValue=input.nextInt();
		switch(conversionChoice) {
			case 1:
				System.out.printf("\n %d Fahrenheit is %d Celsius",temperatureValue,convertIntoCelsius(temperatureValue));
	            break;
	         case 2:
	           System.out.printf( "\n %d Celsius is %d Fahrenheit",temperatureValue, convertIntoFahrenheit(temperatureValue) );
	           break;
		}
	    
			}	
		
	}
	public static void main(String[] args) {
		TemperatureConversion tc=new TemperatureConversion();
		System.out.println("Temperature Conversion Application Guidelines");
		System.out.println("--***--***---***---***---***---***---***---**");
		System.out.println("Enter Number 1 if you want to convert temperature from Fahrenheit into Celsius");
		System.out.println("Enter Number 2 if you want to convert temperature from Celsius into  Fahrenheit");
		System.out.println("Enter Number 3 to exit");
		tc.convertTemperature();	
	}

}
