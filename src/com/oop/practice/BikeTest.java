package com.oop.practice;

public class BikeTest {

	public static void main(String[] args) {
		Bike v1 = new Bike();
		v1.changeGear(2);
		v1.speedUp(20);
		System.out.println("Bike v1 details:");
		v1.printStates();
		
		
		Bike b2 = new Bike();
		b2.changeColor("Red");
		b2.changeGear(3);
		b2.speedUp(40);
		System.out.println("Bike b2 details:");
		b2.printStates();
	}

}
