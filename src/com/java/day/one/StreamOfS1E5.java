package com.java.day.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamOfS1E5 {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(42, 44, 43, 41);
		
		Comparator<Integer> comparator = Comparator.comparing(Integer::intValue);
		
		Optional<Integer> min = numList.stream().min(comparator);
		
		min.ifPresent(System.out::println);
		
		System.out.println("***************************************************");
		
		Optional<Integer> max = numList.stream().max(comparator);
		
		max.ifPresent(System.out::println);
		
		System.out.println("***************Min And Max In String**********************");
		
		List<String> strList = Arrays.asList("Mohit", "Nilesh", "Shankar", "Brajesh");
		
		Comparator<String> com = Comparator.comparing(String::valueOf);
		
		Optional<String> min1 = strList.stream().min(com);
		
		min1.ifPresent(System.out::println);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
        Optional<String> max1 = strList.stream().max(com);
		
		max1.ifPresent(System.out::println);
		
		
		
	}

}
