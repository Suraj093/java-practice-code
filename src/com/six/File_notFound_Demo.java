package com.six;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_notFound_Demo {

	public static void main(String[] args) {

		try {

			File file = new File("D:\\contact.txt");
			FileReader reader = new FileReader(file);
			System.out.println("File Reader :- " + reader);

		} catch (FileNotFoundException f) {
			// TODO: handle exception
			System.out.println("File Not Found Exception :- " + f.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
