package com.util.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatEx2 {

	public static void main(String[] args) {
		// Make a String that has a date in it,
		// with MEDIUM date format
		// and SHORT time format.
		String dateString = "Nov 23, 1976 5:14 PM";

		// Get the default MEDIUM/SHORT DateFormat
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
		try {
			Date date = format.parse(dateString);
			System.out.println("Original string: " + dateString);
			System.out.println("Parsed date    : " + date.toString());

		} catch (ParseException e) {
			System.out.println("Exception: could not parse date in string \"" + dateString + "\"");
		}

	}

}
