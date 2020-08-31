package com.lionbridge.training.assignment.polymorphism;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[]=new Shape[4];
		shape[0]=new Square(12.0);
		shape[1]=new Triangle(4.0,2.0);
		shape[2]=new Sphere(2.0);
		shape[3]=new Cube(4.0);
		for (Shape curentShape : shape) {
            System.out.println(curentShape);
            if (curentShape instanceof TwoDimensionalShape) {
            	TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) curentShape;
                System.out.println("Area:"+twoDimensionalShape.getArea());
            } else if (curentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) curentShape;
                System.out.println("Area:" + threeDimensionalShape.getArea());
                System.out.println("Volume:"+threeDimensionalShape.getVolume());
            }

		}
	}

}
