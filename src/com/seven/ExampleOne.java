package com.seven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ExampleOne {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Example One");

		list.add("Example Two");

		list.add("Example Three");

		list.add("Example Four");

		// System.out.println(list);

		list.forEach(System.out::println);

		System.out.println("------------------------------------------");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String next = it.next();

			System.out.println("Next Elemetns :- " + next);
		}
		
		System.out.println("---------------------------------------------");
		
		MyConsumer Mc = new MyConsumer();
		list.forEach(Mc);
		

	}

}

class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub

		System.out.println("Elements are " + t);

	}

}
