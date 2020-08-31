package com.lionbridge.training.assignment.inheritance.car;

public class TwoWheeler extends Vehicle {
	@Override
	public void vehicleType() {
		System.out.println("Bike belongs to TwoWheeler Vehicle Type");
		
	}
	public static void main(String[] args) {
		Vehicle type=new TwoWheeler();
		type.vehicleType();
	}

}
