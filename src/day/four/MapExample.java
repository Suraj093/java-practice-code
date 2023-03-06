package day.four;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		String str = "Suraj Kushwaha Suman Kushwaha";

		Map<Integer, String> map = new HashMap<>();

		String[] split = str.split(" ");

		for (int i = 0; i < split.length; i++) {
			map.put(i + 1, split[i]);
		}

		System.out.println(map.entrySet());

	}

}
