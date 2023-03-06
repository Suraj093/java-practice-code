package com.nine;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SE1EP06 {

	public static void main(String[] args) {

		String[] str = { "Sunny", "Bunny", "Tunny", "Chuuny" };

		List<String> strList = Arrays.asList(str);

		System.out.println("Array To List conversion :- " + strList);
		
		
		for (String l : strList) {
			if (l.toUpperCase().startsWith("T")) {
				System.out.println(l);
			}
		}
		
		System.out.println("----------------------------------------------");
		
		Predicate<String> isAvilable = s -> s.startsWith("C");
		
		List<String> collect = strList.stream().filter(isAvilable).collect(Collectors.toList());
		
		System.out.println("Collect data " + collect);


	}

}
