package com.io.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public static void main(String[] args) {
		File inputFile = new File("intest.txt");
		try {
			FileReader reader = new FileReader(inputFile);
			int i;
			while((i = reader.read()) != -1) {
				System.out.println((char)i);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
