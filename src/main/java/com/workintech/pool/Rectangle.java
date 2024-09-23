package com.workintech.pool;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(double width, double length){
		if(width < 0) this.width = 0;
		if(length < 0) this.length = 0;
		this.width = width;
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea(){
		return width * length;
	}
}
