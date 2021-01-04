package com.io.practice;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountLinesAndWords {

	public static void main(String[] args) {
		File inputFile = new File("MultiLines.txt");
		int lineCounter = 0;
		int wordCounter = 0;
		
		try {
			FileInputStream fStream = new FileInputStream(inputFile);
			DataInputStream dStream = new DataInputStream(fStream);
			
			while(dStream.available() != 0) {
				String line = dStream.readLine();
				System.out.println(line);
				lineCounter++;
				
				String[] words = line.split(" ");
				System.out.println("No of words in the above line: " + words.length);
				wordCounter += words.length;
			}
			
			dStream.close();
			fStream.close();
			
			System.out.println();
			System.out.println("Total Number of lines: "+ lineCounter);
			System.out.println("Total Number of words: "+ wordCounter);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
