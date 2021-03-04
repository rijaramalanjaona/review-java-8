package dev.rija.reviewjava8.r07streams.collectorsgroupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Group by a List and display the total count of it.
 */
public class Java8StreamCollectorsGroupingBy1 {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		Map<String, Long> result = items.stream()
				.collect(
						Collectors.groupingBy(
								Function.identity(), // function that always returns its input argument.
								Collectors.counting()));
		
		System.out.println(result); // {papaya=1, orange=1, banana=2, apple=3}
	}
}
