package com.io.practice;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) {
		File inputFile = new File("MultiLines.txt");
		try {
			FileInputStream fStream = new FileInputStream(inputFile);
			DataInputStream dStream = new DataInputStream(fStream);
			
			while(dStream.available() != 0) {
				String line = dStream.readLine();
				System.out.println(line);
			}
			
			dStream.close();
			fStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
