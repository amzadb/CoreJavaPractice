package com.util.practice;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// Get the system date/time
		Date date = new Date();

		System.out.println("Date: " + date.getDate());
		System.out.println("Month: " + (date.getMonth() + 1));
		System.out.println("Year: " + (date.getYear() + 1900));
		System.out.println("Time: " + date.getTime());

	}

}
