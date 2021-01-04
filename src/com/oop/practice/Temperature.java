package com.oop.practice;

public class Temperature {
	int temp;
	
	public Temperature(int temp) {
		this.temp = temp;
	}
	
	public void test() throws TooHot, TooCold {
		if (temp > 80) {
			throw new TooHot("Very Hot");
		}
		
		if (temp < 10) {
			throw new TooCold("Very Cold");
		}
		
		if (temp >= 10 && temp <= 80) {
			System.out.println(temp + ": Perfect temperature");
		}
	}
}
