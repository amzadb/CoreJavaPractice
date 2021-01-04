package com.oop.practice;

public class StaticTest {
	static {
		System.out.println("Hi");
	}

	private void print(int i) {
		System.out.println("Hello " + i);
	}

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		st1.print(1);
		StaticTest st2 = new StaticTest();
		st2.print(2);
	}

}
