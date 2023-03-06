package com.java.practice.code;

public class ExampleOne {

	public static void main(String[] args) {

		boolean result_part = test_Whole_part("Demo");

		System.out.println("Result is " + result_part);
		
		NameOfTheDay sunday = NameOfTheDay.SUNDAY;
		
		System.out.println("Sunday ==>> " + sunday);

	}

	private static boolean test_Whole_part(String string) {

		boolean isContain = false;

		if (string.contains("S")) {
			isContain = true;
		}
		return isContain;

	}

}
