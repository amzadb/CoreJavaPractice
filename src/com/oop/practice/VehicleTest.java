package com.oop.practice;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.changeGear(2);
		v1.speedUp(20);
		System.out.println("Vehicle v1 details:");
		v1.printStates();
		
		Vehicle v2 = new Vehicle();
		v2.speedUp(30);
		v2.speedUp(20);
		v2.changeGear(4);
		v2.applyBrakes(20);
		System.out.println("Vehicle v2 details:");
		v2.printStates();
		
	}

}
