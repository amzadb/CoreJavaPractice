package com.util.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// create a hash set
		TreeSet<String> hs = new TreeSet<String>(Collections.reverseOrder());

		// add elements to the hash set
		
		hs.add("Amzad");
		hs.add("David");
		hs.add("Engineer");
		hs.add("Cathy");
		hs.add("Ford");
		hs.add("Naveen");
		hs.add("Geetanshu");
		hs.add("Basha");
		hs.add("Ford");
		
		System.out.println(hs);

		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			String element = i.next();
			System.out.println(element);
		}
	}

}
