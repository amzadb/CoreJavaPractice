package com.util.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Arshad");
		al.add("Afsar");
		al.add("Aleefia");
		al.add("Aneesa");
		al.add("Aaqib");
		al.add("Naveen");
		al.add("Geetanshu");
		al.add(100);
		al.add(123.45);
		al.add(new Date());

		System.out.println(al);

		System.out.println("Printing ArrayList elements using regular for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("-----------");
		System.out.println("Printing ArrayList elements using enhanced for loop");
		for (Object s : al) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		System.out.println("Printing ArrayList elements using Iterator");
		Iterator<?> i = al.iterator();
		while (i.hasNext()) {
			Object element = i.next();
			System.out.println(element);
		}

	}

}
