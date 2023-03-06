package com.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer a1, Integer a2) {
		// TODO Auto-generated method stub
		return a2.compareTo(a1);
	}

}

class SortByAssendingOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer obj1, Integer obj2) {
		// TODO Auto-generated method stub
		return obj1.compareTo(obj2);
	}
	
}

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(90);
		list.add(65);
		list.add(45);
		list.add(23);
		list.add(10);
		
		System.out.println("Aarray List before sort :- " + list);
		
		MyCompare customSort = new MyCompare();
		
		SortByAssendingOrder byAssecdingOrder = new SortByAssendingOrder();
		
		Collections.sort(list, byAssecdingOrder);
		
		System.out.println("------------------------------------");
		
		System.out.println("Array List after sort :- " + list);
		
		

	}

}
