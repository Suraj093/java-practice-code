package day.four;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMapExample {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world....");
		
		
		Map<String,Integer> mal = new HashMap<>();
		
		mal.put("A", 101);
		mal.put("B", 102);
		mal.put("C", 104);
		
		System.out.println("New Map List " + mal);
		
		Set<Entry<String, Integer>> entrySet = mal.entrySet();
		
		for(Entry<String,Integer> m : entrySet) {
			
			System.out.println(m.getKey());
			
			System.out.println(m.getValue());
			
		}
		
	}

}
