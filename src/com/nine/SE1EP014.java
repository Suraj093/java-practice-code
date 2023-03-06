package com.nine;

import java.util.function.Predicate;

public class SE1EP014 {

	public static Predicate<String> j = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

	public static void main(String[] args) {

		if (j.test("SurajKushwaha")) {
			System.out.println("length is greater than 10");
		} else {
			System.out.println("length is smaller than 10");
		}

	}

}
