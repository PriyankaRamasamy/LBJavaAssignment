package com.lionbridge.training.assignment;

public class Rectangle {
	float length,width=1;
	

	public float getLength() {
		System.out.println("The lenth of the Rectangle : " + this.length);
		return this.length;
	}

	public float setLength(float length) {
		if(length>0.00 && length<20.00) {
			this.length = length;
			return this.length;
			}else {
				System.out.println("Enter the length between 0.0 to 20.0");	
				this.length=0;
				return this.length;
			}		
	}

	public float getWidth() {
		System.out.println("The width of the Rectangle : " + this.width);
		return this.width;
	}

	public float setWidth(float width) {
		if(width>0.00 && width<20.00) {
		this.width = width;
		return this.width;
		}else {
			System.out.println("Enter the width between 0.0 to 20.0");	
			this.width=0;
			return this.width;
		}
	}
	
	public void rectanglePerimeter(float length,float width) {
		setLength(length);
		setWidth(width);
		float perimeter=(2*(getLength()+getWidth()));
		System.out.println("The Perimeter of Rectangle is : " + perimeter);
		
	}
	public void rectangleArea(float length,float width) {
		float area=(getLength()*getWidth());
		System.out.println("The Area of Rectangle is : " + area);
		
	}
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.rectanglePerimeter(1,19);
		System.out.println("-***-----****----*****----***");
		rectangle.rectangleArea(1,19);
		
	}

}
