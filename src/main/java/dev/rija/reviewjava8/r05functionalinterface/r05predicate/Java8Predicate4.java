package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate .negate() in filter
 */
public class Java8Predicate4 {
	public static void main(String[] args) {
		Predicate<String> startWithA = x -> x.startsWith("A");
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		List<String> filteredList = list.stream()
				.filter(startWithA.negate())
				.collect(Collectors.toList());
		
		System.out.println(filteredList);
		// [B, BB, BBB]
	}
}
