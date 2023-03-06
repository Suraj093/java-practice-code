package com.practice.day.SE3EP;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SE3EP01 {
	
	public static void main(String[] args) {
		
		List<Integer> k = new ArrayList<>();
		k.add(40);
		k.add(60);
		k.add(70);
		k.add(10);
		
		System.out.println(k);
		
		List<Integer> sortedOrder = k.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted Order :- " + sortedOrder);
		
		System.out.println("******************************************************");
		
		Predicate<Integer> a = w -> w > 20;
		
		boolean allMatch = k.stream().allMatch(a);
		
		System.out.println(allMatch);
	}

}
