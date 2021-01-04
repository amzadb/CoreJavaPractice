package com.oop.practice;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Start");
		divide(100, 0);
		System.out.println("Stop");
	}

	private static void divide(int i, int j) {
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		try {
			int r = i / j;
			System.out.println("i / j: " + r);
		} catch (ArithmeticException e) {
			System.out.println("Excpetion: " + e.getMessage());
		} 
	}

}
