package com.five;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJava8 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "ab", "abc");
		Consumer<String> c = x -> System.out.println(x);
		forEach(list, c);

	}

	static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

}
