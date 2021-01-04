package com.oop.practice;

public class Vehicle {
	int speed = 0;
	int gear = 1;
	String color = "Black";

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;   
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed);
		System.out.println("Gear: " + gear);
	}

}
