package com.java.day.one;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StreamOfS1E8 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");
		map.put(30, "Narendra");
		map.put(200, "Amit");
		map.put(201, "Vasu");

		Collection<String> values = map.values();

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> d : entrySet) {
			System.out.println("Id -->> " + d.getKey() + ", Name -->> " + d.getValue());
		}

	}

}
