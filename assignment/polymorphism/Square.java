package com.lionbridge.training.assignment.polymorphism;

public class Square extends TwoDimensionalShape{
	private double side;
	public Square(double side) {
		this.side=side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	  
	}

}
