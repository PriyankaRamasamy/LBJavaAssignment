package com.lionbridge.training.assignment.polymorphism;

public class Cube extends ThreeDimensionalShape{
	private double edge;
	public Cube(double edge) {
		this.edge=edge;
	}

	@Override
	public double getArea() {
		return 6 * Math.pow(edge, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(edge, 3);
	}
	

}
