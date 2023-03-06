package com.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SE1EP019 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println("ArrayList :- " + l);
		
		List<Integer> newList = l.stream().filter(s -> s % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("New List :- " + newList);
		
	}

}
