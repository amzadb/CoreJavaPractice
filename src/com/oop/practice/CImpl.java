package com.oop.practice;

public class CImpl implements I, J {

	public static void main(String[] args) {
		CImpl obj = new CImpl();
		int i = 104, j = 5;
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("add: " + obj.add(i, j));
		System.out.println("subtract: " + obj.subtract(i, j));
		System.out.println("isDivisible: " + obj.isDivisible(i, j));
	}

	@Override
	public boolean isDivisible(int x, int y) {
		return (x % y == 0);
	}

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int subtract(int i, int j) {
		return i - j;
	}

}
