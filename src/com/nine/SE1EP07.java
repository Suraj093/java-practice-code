package com.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SE1EP07 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world................");
		
		String[] str = {"Dunny","Sunny","Bunny","Chinny"};
		
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, str);
		
		Collections.reverseOrder();
		
		System.out.println("List " + list);
		
	}

}
