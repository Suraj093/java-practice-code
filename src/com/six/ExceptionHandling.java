package com.six;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		try {
			testException(5);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException Custom Exception " + e.getMessage());

		} catch (Exception e) {

			System.out.println("Custome Exceptions :- " + e.getMessage());

		}

	}

	private static void testException(int i) throws IOException {
		// TODO Auto-generated method stub

		if (i < 0) {

			FileNotFoundException myException = new FileNotFoundException("You have enter negative number");

			throw myException;

		} else {
			IOException inputException = new IOException();

			throw inputException;
		}

	}

}
