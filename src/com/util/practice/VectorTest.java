package com.util.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("Arshad");
		v.addElement("Afsar");
		v.addElement("Aleefia");
		v.addElement("Aneesa");
		v.addElement("Aaqib");
		v.add("Naveen");
		v.add("Geetanshu");

		System.out.println(v);

		System.out.println("Printing Vector elements using Enumeration");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String element = e.nextElement();
			System.out.println(element);
		}

		System.out.println("-----------");
		System.out.println("Printing Vector elements using for loop");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("-----------");
		System.out.println("Printing Vector elements using Iterator");
		System.out.println("Before while, Vector size: " + v.size());
		Iterator<String> i = v.iterator();
		while (i.hasNext()) {
			String element = i.next();
			System.out.println(element);
			i.remove();
		}
		System.out.println("After while, Vector size: " + v.size());

	}

}
