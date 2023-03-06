package com.eight;

import java.io.File;
import java.io.IOException;

public class ExampleFive {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to programming world");

		int count = 0;

		File f = new File("D:\\Document_file");

		f.createNewFile();

		String[] list = f.list();

		for (String fs : list) {
			File innerFile = new File(f, fs);
			if (innerFile.isFile()) {
				System.out.println(fs);
				count++;
			} else if (innerFile.isDirectory()) {
				System.out.println(fs);
			} else {
				System.out.println("No File or Directory avilable on this location");
			}
		}

		System.out.println("Total file are :- " + count);

	}

}
