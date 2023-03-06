// Java 8 Program to Print ten random numbers using forEach?

package com.java.practice.code;

import java.util.Random;

public class ExampleFour {

	public static void main(String[] args) {

		System.out.println("Print ten random numbers using forEach?");

		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

	}

}
