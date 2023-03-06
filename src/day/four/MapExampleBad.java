package day.four;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExampleBad {

	public static void main(String[] args) {

		Map<Integer, String> mapList = new TreeMap<>(Comparator.reverseOrder());

		mapList.put(101, "Kushwaha");
		mapList.put(111, "Suraj");
		mapList.put(131, "Anya");
		mapList.put(95, "Kushwaha");
		mapList.put(96, null);
		mapList.put(97, null);

		for (Entry<Integer, String> m : mapList.entrySet()) {

			System.out.println("Key => " + m.getKey() + "-----" + "value => " + m.getValue());

		}

		System.out.println("Current map list :- " + mapList);

	}

}
