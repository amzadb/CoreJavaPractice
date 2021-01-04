package com.oop.practice;

abstract class P {
	P() {
		System.out.println("P costructor - START");
		m();
		System.out.println("P costructor - END");
	}

	public abstract void m();
}

class Q extends P {
	Q() {
		System.out.println("Q costructor - START");
		m();
		System.out.println("Q costructor - END");
	}

	private int i = 10;

	@Override
	public void m() {
		System.out.println("i: " + i);
	}

}

public class AbstractTest {

	public static void main(String[] args) {
		P obj = new Q();
	}

}
