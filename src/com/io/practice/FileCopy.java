package com.io.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("MultiLines.txt");
		File outputFile = new File("CopiedFile.txt");
		
		FileReader reader = new FileReader(inputFile);
		FileWriter writer = new FileWriter(outputFile);
		
		int i;
		while((i = reader.read()) != -1) {
			writer.write(i);
		}
		
		reader.close();
		writer.close();
		
		System.out.println("Data is copied from " + inputFile.getName() + " to " + outputFile.getName() + " successfully.");
	}

}
