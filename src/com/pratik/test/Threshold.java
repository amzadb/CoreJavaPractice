package com.pratik.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class Threshold {
	public static void main(String[] args) throws IOException {
		Properties paths = new Properties();
		FileReader reader = new FileReader("FilePath.properties");
		paths.load(reader);

		String mfFilePath = paths.getProperty("mfFilePath");
		String thFilePath = paths.getProperty("thFilePath");

		// Find when the threshold file is created
		File thFile = new File(thFilePath);

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Path file = Paths.get(thFile.getAbsolutePath());
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

		System.out.println("creationTime: " + dateFormat.format(attr.creationTime().toMillis()));
		System.out.println("lastAccessTime: " + dateFormat.format(attr.lastAccessTime().toMillis()));
		System.out.println("lastModifiedTime: " + dateFormat.format(attr.lastModifiedTime().toMillis()));

		Date today = new Date();
		System.out.println("Today: " + dateFormat.format(today));

		System.out.println("------ ** --------");

		// Verify the threshold file created date is same as today's date
		if (dateFormat.format(attr.lastAccessTime().toMillis()).equals(dateFormat.format(today))) {
			System.out.println("Threshold file is updated today!");

			// Reading threshold value from threshold folder's freeride file
			Scanner thScanner = new Scanner(thFile);
			String thData = "";
			while (thScanner.hasNext()) {
				thData = thScanner.next();
				System.out.println("thData: " + thData);
			}
			thScanner.close();

			// Reading threshold value from mainframe file
			File mfFile = new File(mfFilePath);

			BufferedReader mfReader = new BufferedReader(new FileReader(mfFile));
			String mfData = mfReader.readLine();
			String newContent = "";
			String oldContent = "";

			while (mfData != null) {
				oldContent = oldContent + mfData + System.lineSeparator();
				if (mfData.contains("THRESHOLD")) {
					StringBuilder thValue = new StringBuilder(thData.split("=")[1]);
					for (int i = thValue.length(); i < 10; i++) {
						thValue.insert(0, "0");
					}
					System.out.println("thValue: " + thValue);

					System.out.println("mfData: " + mfData);
					String[] thresholdData = mfData.split(" ");

					// Replacing old threshold with new threshold value
					newContent = oldContent.replaceAll(thresholdData[3], thValue.toString());
				}
				mfData = mfReader.readLine();
			}

			System.out.println("newContent: " + newContent);
			// Write the threshold data into mainframe file
			FileWriter mfWriter = new FileWriter(mfFile);
			mfWriter.write(newContent);

			mfReader.close();
			mfWriter.close();

			System.out.println("Threshold value is updated in Mainframe file successfully!!!");

		} else {
			System.out.println("Threshold file is not updated!!");
		}

		System.out.println("----- ** ----------");
	}

}
