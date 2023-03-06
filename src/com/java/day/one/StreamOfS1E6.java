package com.java.day.one;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamOfS1E6 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");
		map.put(30, "Narendra");
		map.put(200, "Amit");

		Comparator<Entry<Integer, String>> comparing = Comparator.comparing(e -> e.getKey());

		List<UserData> list = map.entrySet().stream().sorted(comparing).map(e -> newUserData(e))
				.collect(Collectors.toList());

		list.forEach(l -> System.out.println("Id: " + l.getId() + ", Name: " + l.getName()));
	}

	private static UserData newUserData(Entry<Integer, String> e) {
		return new UserData(e.getKey(), e.getValue());
	}

}
