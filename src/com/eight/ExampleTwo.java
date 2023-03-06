package com.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyCompareList implements Comparator<String> {

	@Override
	public int compare(String obj1, String obj2) {
		// TODO Auto-generated method stub
		 int compareToIgnoreCase = obj2.compareToIgnoreCase(obj1);
		 
		 System.out.println("Custom Compare : " + compareToIgnoreCase);
		 
		 return compareToIgnoreCase;
	}
	
}

public class ExampleTwo {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		strList.add("Suman Kushwaha");
		strList.add("Anya Kushwaha");
		strList.add("Suraj Kushwaha");
		strList.add("Gudiya Kushwaha");
		strList.add("Suresh Kushwaha");
		
		System.out.println("String List :- " + strList);
		
		System.out.println("-------------------------------------------");
		
		Collections.sort(strList);
		
		System.out.println("String List :- " + strList);
		
		System.out.println("-------------------------------------------");
		
		MyCompareList list = new MyCompareList();
		
		Collections.sort(strList,list);
		
		System.out.println("String List :- " + strList);
		
	}

}
