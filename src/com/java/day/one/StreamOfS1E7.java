package com.java.day.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StreamOfS1E7 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");
		map.put(30, "Narendra");
		map.put(200, "Amit");
		map.put(201, "Vasu");

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);

		}

	}

}
