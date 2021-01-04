package com.util.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		// Get the system date/time
		Date date = new Date();
		System.out.println("Default Date: " + date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println("Formatted Date Value: " + dateFormat.format(date));

	}

}
