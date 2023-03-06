package com.java.practice.code;

import java.util.ArrayList;

public class ExampleTwo {

	public static void main(String[] args) {

		String str = "Welcome to you";

		ArrayList<String> arrayList = new ArrayList<>();

		String[] split = str.split(",");

		for (int i = 0; i < split.length; i++) {
			arrayList.add(split[i]);
		}

		System.out.println("Hello World............");

		System.out.println("All Element:- " + arrayList);

	}

}
