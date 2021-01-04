package com.io.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContent {

	public static void main(String[] args) {
		File outputFile = new File("outtest.txt");
		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.write("Sample content\n");
			writer.write("One more line of content");
			writer.close();
			System.out.println("Data is written into " + outputFile.getName() + " successfully.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
