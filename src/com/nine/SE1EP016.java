package com.nine;

import java.util.function.Predicate;

public class SE1EP016 {

	public static Predicate<String> g = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			return t.contains("G");
		}

	};

	public static void main(String[] args) {

		if (g.test("Gopal")) {
			System.out.println("Yes contain");
		} else {
			System.out.println("Not contain");
		}

	}

}
