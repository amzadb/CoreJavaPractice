package com.oop.practice;

public class Circle extends Shape {
	private double radius = 0.0;

	@Override
	public double getArea() {
		return 3.142 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
