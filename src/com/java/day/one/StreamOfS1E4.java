package com.java.day.one;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamOfS1E4 {
	
	public static void main(String[] args) {
		
		IntStream intNumber = IntStream.of(10,20,30,40);
		
		intNumber.forEach(System.out::println);
		
		System.out.println("**************************************************");
		
		LongStream longStream = LongStream.of(100l,200l,300l,400l);
		
		longStream.forEach(System.out::println);
		
	}

}
