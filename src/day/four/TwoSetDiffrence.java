package day.four;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSetDiffrence {

	public static void main(String[] args) {
		Set<String> set1 = Stream.of("Kotlin", "Java", "Rust", "Python", "C++").collect(Collectors.toSet());
		Set<String> set2 = Stream.of("Kotlin", "Java", "Rust", "Ruby", "C#").collect(Collectors.toSet());
		
		System.out.println("Set One Example :-" + set1);
		System.out.println("Set One Example :-" + set2);
		
		set1.stream().forEach(System.out::println);
		set2.stream().forEach(System.out::println);
		
	}

}
