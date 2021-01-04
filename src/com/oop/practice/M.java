package com.oop.practice;

public class M {

	public static void main(String[] args) {
		aMethod(args); // static method calling
		M obj = new M();
		obj.bMethod(args); // non-static method calling
	}

	private void bMethod(String[] args) {
		System.out.println("bMethod...");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}		
	}

	private static void aMethod(String[] args) {
		System.out.println("aMethod...");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
