package com.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SE1EP08 {
	
	public static void main(String[] args) {
		
        System.out.println("Welcome to programming world................");
		
		String[] str = {"Dunny","Sunny","Bunny","Chinny"};
		
		List<String> strList = new ArrayList<>();
		
		Collections.addAll(strList, str);
		
		Collections.sort(strList);
		
		System.out.println("Sorted element are :- " + strList);
		
		int binarySearch = Collections.binarySearch(strList, "Sunny");
		
		System.out.println("Element present at number " + binarySearch + " position");
		
	}

}
