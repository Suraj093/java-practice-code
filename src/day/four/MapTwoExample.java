package day.four;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTwoExample {
	public static void main(String[] args) {
		System.out.println("Welcome to programming world...");

       System.out.println("----------------------------------------------");
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(104, "Suraj");
		hashMap.put(103, "Hai");
		hashMap.put(101, "Demo");
		hashMap.put(102, "Nahi");
		hashMap.put(null, null);
		hashMap.put(99, null);
		System.out.println("Hash Map List :- " + hashMap);


		System.out.println("----------------------------------------------");
		
		Map<Integer, String> mapValue = new LinkedHashMap<>();
		mapValue.put(null, null);
		mapValue.put(99, null);
		mapValue.put(104, "Suraj");
		mapValue.put(103, "Hai");
		mapValue.put(101, "Demo");
		mapValue.put(102, "Nahi");
		System.out.println("Linked Hash Map List :- " + mapValue);
		
		System.out.println("----------------------------------------------");
		
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(104, "Suraj");
		treeMap.put(103, "Hai");
		treeMap.put(101, "Demo");
		treeMap.put(102, "Nahi");
		System.out.println("Tree Map List :- " + treeMap);

	}
}
