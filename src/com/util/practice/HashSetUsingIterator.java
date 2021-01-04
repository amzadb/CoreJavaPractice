package com.util.practice;

import java.util.HashSet;

public class HashSetUsingIterator {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i <= 10; i++) { // 11 times
			set.add(new Integer(i % 5));
		}
		
		System.out.println("HashSet Size: " + set.size());
		System.out.println("HashSet Data: " + set);
	}

}
