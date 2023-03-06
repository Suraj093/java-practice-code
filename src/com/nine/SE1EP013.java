package com.nine;

import java.util.function.Predicate;

public class SE1EP013 {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = l -> l > 21;

		pred(20, pr);

	}

	private static void pred(int i, Predicate<Integer> num) {

		if (num.test(i)) {
			System.out.println("Your number is valid data");
		}else {
			System.out.println("Your number is not valid data");
		}

	}

}
