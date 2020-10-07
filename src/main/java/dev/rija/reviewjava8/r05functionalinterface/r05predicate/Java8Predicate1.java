package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate is a functional interface, which accepts an argument and returns a boolean.
 * Usually, it used to apply in a filter for a collection of objects.
 *
 * @FunctionalInterface
 * public interface Predicate<T> {
 *   boolean test(T t);
 * }
 *
 * Predicate in filter
 */
public class Java8Predicate1 {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan5 = x -> x > 5;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> filteredList = list.stream()
				.filter(greaterThan5)
				.collect(Collectors.toList());
		
		System.out.println(filteredList);
		// [6, 7, 8, 9, 10]
	}
}
