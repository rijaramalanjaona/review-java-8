package dev.rija.reviewjava8.r07streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2 levels Stream or 2d arrays :
 * # Stream<String[]>
 * # Stream<Stream<String>>
 * # String[][]
 *
 * [
 *   [1, 2],
 *   [3, 4],
 *   [5, 6]
 * ]
 *
 * flatMap() converts the above 2 levels Stream into one Stream level or a 2d array into a 1d array
 * # Stream<String>
 * # String[]
 *
 * [1, 2, 3, 4, 5, 6]
 *
 * Stream<String[]>      -> flatMap ->	Stream<String>
 * Stream<Set<String>>   -> flatMap ->	Stream<String>
 * Stream<List<String>>  -> flatMap ->	Stream<String>
 * Stream<List<Object>>  -> flatMap ->	Stream<Object>
 */
public class Java8StreamFlatMap1 {
	public static void main(String[] args) {
		String[][] array = new String[][]{
				{"a", "b"},
				{"c", "d"},
				{"e", "f"}
		};
		
		// we want to filter out the a and print out all the characters
		
		Stream<String[]> stream1 = Arrays.stream(array);
		List<String[]> result1 = stream1
				.filter(x -> !"a".equals(x)) // x is a String[], not String
				.collect(Collectors.toList());
		System.out.println("result1");
		result1.forEach(x -> System.out.println(Arrays.toString(x)));
		// [a, b]
		// [c, d]
		// [e, f]
		
		Stream<String[]> stream2 = Stream.of(array);
		List<String[]> result2 = stream2
				.filter(x -> {
					for (String s : x) {
						if ("a".equals(s)) {
							return false;
						}
					}
					return true;
				})
				.collect(Collectors.toList());
		System.out.println("result2");
		result2.forEach(x -> System.out.println(Arrays.toString(x)));
		// [c, d]
		// [e, f]
		
		System.out.println("flatMap");
		String[] array1d = Stream.of(array) // Stream<String[]>
				.flatMap(Stream::of) // Stream<String>
				.toArray(String[]::new); // [a, b, c, d, e, f]
		for (String s : array1d) {
			System.out.println(s);
		}
		
		System.out.println("flatMap - filter");
		List<String> result3 = Stream.of(array)
				.flatMap(Stream::of)
				.filter(x -> !"a".equals(x))
				.collect(Collectors.toList());
		System.out.println(result3); // [b, c, d, e, f]
	}
}
