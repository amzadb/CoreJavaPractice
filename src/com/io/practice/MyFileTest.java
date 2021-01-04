package com.io.practice;

import java.io.File;

public class MyFileTest {

	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("No program arguments");
		} else {
			File inputFile = new File(args[0]);
			System.out.println("The File Name: " + inputFile.getName());
			System.out.println("The File Path: " + inputFile.getAbsolutePath());
			System.out.println("Is Directory?: " + inputFile.isDirectory());
			if (inputFile.isDirectory()) {
				String[] fileNames = inputFile.list();
				for (String fileName : fileNames) {
					System.out.println(fileName);
				}
			}
		}
	}

}
