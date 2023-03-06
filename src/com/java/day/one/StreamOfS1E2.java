package com.java.day.one;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfS1E2 {

	public static void main(String[] args) {

		Stream<Integer> intData = Stream.of(10, 20, 30, 40, 50);
		intData.map(t -> t * 2).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("************************************************************");

		Stream<String> str = Stream.of("A", "B", "C", "D", "E");

		str.map(s -> s.toUpperCase()).forEach(System.out::println);

	}

}
