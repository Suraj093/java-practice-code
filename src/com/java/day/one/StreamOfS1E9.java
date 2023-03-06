package com.java.day.one;

import java.util.HashMap;
import java.util.Map;

public class StreamOfS1E9 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");
		map.put(30, "Narendra");
		map.put(200, "Amit");
		map.put(201, "Vasu");
		
		String orDefault = map.getOrDefault(154, "Default Value");
		
		System.out.println(orDefault);
		
		
		
	}

}
