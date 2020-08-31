package com.lionbridge.training.assignment;

public class CalculateProductSeries {
	public int calculateProduct(int ... number){
		int product= 1;
		for(int productValue: number){
			product *= productValue;
		}
		return product;
	}
	
	 public static void main( String[] args ) {
		 CalculateProductSeries productSeries = new CalculateProductSeries();
		 System.out.printf("The First Variable Argument List to ProductSeries Value is : %d \n",productSeries.calculateProduct(9,9));
		 System.out.printf("The Second Variable Argument List to ProductSeries Value is : %d \n",productSeries.calculateProduct(2,4,16));
		 System.out.printf("The Third Variable Argument List to ProductSeries Value is : %d \n",productSeries.calculateProduct());
		 System.out.printf("The Fourth Variable Argument List to ProductSeries Value is : %d \n",productSeries.calculateProduct(9,10,11,2));
		 System.out.printf("The Fifth Variable Argument List to ProductSeries Value is : %d \n",productSeries.calculateProduct(1,7,8,9,1,12,11,10));
	 }
}
	 
		    
		 
		
	
	

    
		  
		  

