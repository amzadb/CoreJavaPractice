package com.util.practice;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<String, String>();
		
		m.put("Amzad", "Trainer");
		m.put("Abhi", "Engineer");
		m.put("Sushmitha", "Student");
		m.put("Sateesh", "Professor");
		m.put("Hema", "Doctor");
		m.put("Geethanshu", "Doctor");
		m.put("Naveen", "Student"); 
		
		System.out.println(m);

		Iterator<String> i = m.keySet().iterator();
		while (i.hasNext()) {
			String key =  i.next();
			String val = m.get(key);
			System.out.println(key + " = " + val);
		}
	}

}
