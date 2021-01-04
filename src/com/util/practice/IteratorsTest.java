package com.util.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorsTest {

	public static void main(String[] args) {
		// Create an array list
		ArrayList<String> al = new ArrayList<String>();

		// Add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("B");
		
		// Use iterator to display contents of al
		System.out.println("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
		System.out.println("-----------");

		// Modify objects being iterated
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
		System.out.println("-----------");

		// Display the list backwards
		System.out.println("Modified list backwards: ");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.println(element);
		}

	}

}
