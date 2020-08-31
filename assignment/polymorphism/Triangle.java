package com.lionbridge.training.assignment.polymorphism;

public class Triangle extends TwoDimensionalShape{
	private double base,height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;		
	}
	@Override
	public double getArea() { 
		return (base*height)/2;
	}

}
