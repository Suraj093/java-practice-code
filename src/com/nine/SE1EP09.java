package com.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SE1EP09 {
	
	public static void main(String[] args) {
		
		List<String> str1 = new ArrayList<>();
		str1.add("Welcome");
		str1.add("to");
		str1.add("Suraj");
		
		List<String> str2 = new ArrayList<>();
		str2.add("You");
		
		Collections.copy(str1, str2);
		
		System.out.println(str1);
		
	}

}
