package com.oop.practice;

public class Rectangle extends Shape {

	private double height = 0.0;
	private double width = 0.0;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return height * width;
	}

}
