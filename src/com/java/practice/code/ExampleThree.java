package com.java.practice.code;

public class ExampleThree {

	public static void main(String[] args) {

		int a = 5, b = 40, c = 30;

		largestNumber(a, b, c);

		System.out.println("---------------------------------------------");

		smallestNumber(a, b, c);

	}

	private static void smallestNumber(int a, int b, int c) {
		// TODO Auto-generated method stub

		if (a < b) {
			System.out.println(a + " is smaller number");
		} else if (b < c) {
			System.out.println(b + " is smaller number");
		} else {
			System.out.println(c + " is smaller number");
		}

	}

	private static void largestNumber(int a, int b, int c) {
		// TODO Auto-generated method stub

		if (a > b) {
			System.out.println(a + "is larger number");
		} else if (b > c) {
			System.out.println(b + " is larger number");
		} else {
			System.out.println(c + " is larger number");
		}

	}

}
