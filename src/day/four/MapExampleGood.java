package day.four;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleGood {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1001);
		map.put("Two", 1002);

		if (map.size() >= 2) {
			System.out.println("You are two good");
		} else {
			System.out.println("You are two not good");
		}

		// map.remove("One");
		
		
		Set<String> keySet = map.keySet();
		Collection<Integer> values = map.values();
		
		values.stream().forEach(System.out::println);
		

	}

}
