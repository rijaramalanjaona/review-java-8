package dev.rija.reviewjava8.r05functionalinterface.r07consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Same forEach method to accept Consumer as an argument; this time, we will print the length of the string.
 */
public class Java8Consumer3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "ab", "abc");
		forEach(list, x -> System.out.println(x.length()));
		// 1
		// 2
		// 3
	}
	
	static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}
}
