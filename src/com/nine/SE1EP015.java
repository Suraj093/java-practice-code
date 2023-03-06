package com.nine;

import java.util.function.Predicate;

class MyPredicate implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.charAt(0) == 'K';
	}
}

public class SE1EP015 {

	public static void main(String[] args) {

		MyPredicate j = new MyPredicate();
		boolean test = j.test("Homal");

		if (test) {
			System.out.println("First place contain K element");
		} else {
			System.out.println("First place not contain K element");
		}

	}

}
