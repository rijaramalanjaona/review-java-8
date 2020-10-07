package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate .or() in filter
 */
public class Java8Predicate3 {
	public static void main(String[] args) {
		Predicate<String> lengthIs3 = x -> x.length() == 3;
		Predicate<String> startWithA = x -> x.startsWith("A");
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		List<String> filteredList = list.stream()
				.filter(lengthIs3.or(startWithA))
				.collect(Collectors.toList());
		
		System.out.println(filteredList);
		// [A, AA, AAA, BBB]
	}
}
