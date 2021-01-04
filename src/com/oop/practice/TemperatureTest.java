package com.oop.practice;

public class TemperatureTest {

	public static void main(String[] args) {
		temperatureReport(new Temperature(100));
		temperatureReport(new Temperature(-10));
		temperatureReport(new Temperature(50));
	}

	private static void temperatureReport(Temperature tempObj) {
		try {
			tempObj.test();
		} catch (BadTemperature e) {
			System.out.println(tempObj.temp + ": " + e.getMessage());
		}
	}

}
