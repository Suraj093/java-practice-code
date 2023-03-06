package com.java.day.one;

import java.util.ArrayList;
import java.util.List;

public class StreamOfS1E1 {
	
	public static void main(String[] args) {
		
		List<String> streamList = addList();
		
		displayData(streamList);
		
		System.out.println("----------------------------------");
		
		display(streamList);
		
}

	private static void displayData(List<String> streamList) {
		streamList.forEach(System.out::println);
	}

	private static List<String> addList() {
		List<String> streamList = new ArrayList<>();
		streamList.add("Suraj");
		streamList.add("Suman");
		streamList.add("Anya");
		streamList.add("Manju");
		return streamList;
	}

	private static void display(List<String> streamList) {
		for(String e : streamList) {
			System.out.println(e);
		}
	}

}
