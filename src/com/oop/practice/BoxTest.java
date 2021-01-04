package com.oop.practice;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
//		b1.setHeight(3);
//		b1.setLength(8);
//		b1.setWidth(4);		
		System.out.println("Box b1 details:");
		System.out.println(" length: " + b1.getLength());
		System.out.println(" width: " + b1.getWidth());
		System.out.println(" height: " + b1.getHeight());
		
		Box b2 = new Box(8, 7, 5);
		System.out.println("Box b2 details:");
		System.out.println(" length: " + b2.getLength());
		System.out.println(" width: " + b2.getWidth());
		System.out.println(" height: " + b2.getHeight());
		System.out.println(" volumne: " + b2.calcVolume());
		
		System.out.println();
	}

}
