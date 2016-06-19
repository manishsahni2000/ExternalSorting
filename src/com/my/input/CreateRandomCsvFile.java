package com.my.input;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateRandomCsvFile {

	public static void main(String[] args) throws IOException {

		File file = new File("D://Study_Material//input.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		for (int i = 1; i < 400; i++) {

			writer.write(generateRandomString());
			writer.newLine();
		
		}

	}

	public static String generateRandomString() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit
					+ (int) (new Random().nextFloat() * (rightLimit - leftLimit));
			//System.out.println(randomLimitedInt);
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		
		return generatedString.toString();

		//System.out.println(generatedString);
	}

}
