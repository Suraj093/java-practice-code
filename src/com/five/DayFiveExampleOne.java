package com.five;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DayFiveExampleOne {

	public static void main(String[] args) {
		System.out.println("Welcome to programming world.........");

		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Suraj");
		map.put(10, "Anya");
		map.put(20, "Suman");
		map.put(2, "Suman Kushwaha");

		System.out.println("Map List " + map);

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(2, "Suraj");
		map1.put(10, "Anya");
		map1.put(20, "Suman");
		map1.put(null, null);

		System.out.println(map1);

		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(2, "Suraj");
		map2.put(10, "Anya");
		map2.put(20, "Suman");

		Collection<String> keySet = map2.values();

		for (String mx : keySet) {
			if (mx.startsWith("S")) {
				System.out.println(mx);
			}
		}

	}

}
