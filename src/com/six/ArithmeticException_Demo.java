package com.six;

public class ArithmeticException_Demo {

	public static void main(String[] args) {

		try {
			int a = 50, b = 0;
			int result = a / b;
			System.out.println("Result :- " + result);
			System.out.println("Successfully calculated...");
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println("A number can't devide by zero");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception :- " + e.getMessage());
			e.printStackTrace();
		}
	}
}
