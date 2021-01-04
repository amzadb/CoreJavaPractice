package com.oop.practice;

public class TooCold extends BadTemperature {

	public TooCold() {
		super("Default - Cold");
	}

	public TooCold(String reason) {
		super(reason);
	}

}
