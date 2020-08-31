package com.lionbridge.training.assignment.polymorphism;

public class Sphere extends ThreeDimensionalShape {
	private double radius;
	public Sphere(double radius) {
		this.radius=radius;
	}
	@Override
	public double getArea() {	
		return 4*Math.PI*Math.pow(radius,2);
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}
	

}
