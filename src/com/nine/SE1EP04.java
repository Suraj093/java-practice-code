package com.nine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Suraj Kushwaha
 *
 */




public class SE1EP04 {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to programming world.....");

		File f = new File("D:\\file\\contact.txt");

		FileWriter myWriter = new FileWriter(f);

		myWriter.write("Files in Java might be tricky, but it is fun enough!");
		myWriter.close();
		System.out.println("Successfully wrote to the file.");

	}
}
