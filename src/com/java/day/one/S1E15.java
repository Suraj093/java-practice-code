package com.java.day.one;

import java.util.HashMap;
import java.util.Map;

public class S1E15 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Durga");
		map.put(102, "Suraj");
		map.put(301, "Dummy");

		for (Map.Entry<Integer, String> enty : map.entrySet()) {

			System.out.println("Integer " + enty.getKey() + " Values " + enty.getValue());

		}

	}

}
