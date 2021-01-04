package com.util.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ShowSystemProps {

	public static void main(String[] args) throws IOException {
		Properties p = System.getProperties();
		p.list(System.out);

		FileOutputStream fos = new FileOutputStream("mysystem.properties");
		p.store(fos, null);
		fos.close();

	}

}
