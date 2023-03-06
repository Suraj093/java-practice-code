package com.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SE1EP020 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world.....");
		
		System.out.println("**************************************");
		
		List<Integer> f = new ArrayList<>();
		f.add(5);
		f.add(10);
		f.add(15);
		f.add(20);
		f.add(25);
		
		System.out.println("Array List :- " + f);
		
		List<Integer> mapList = f.stream().map(n -> n * 2).collect(Collectors.toList());
		
		System.out.println("Map List :- " + mapList);
		
	}

}
