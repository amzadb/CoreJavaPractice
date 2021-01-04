package com.oop.practice;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		int i = 100, j = 4;
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		int result = divide(i, j);
		System.out.println("i / j: " + result);
		
		System.out.println("Stop");
	}

	private static int divide(int i, int j) {
		int r = 0;
		try {
			r = i / j;
		} catch (ArithmeticException e) {
			System.out.println("Excpetion: " + e.getMessage());
		} finally {
			if (r == 0) {
				System.out.println("finally after exception");
			} else {
				System.out.println("finally without exception");
			}
		}
		
		return r;
	}

}
