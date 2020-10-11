package dev.rija.reviewjava8.r05functionalinterface.r07consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * This example accepts Consumer as an argument, simulates a forEach to print each item from a list.
 */
public class Java8Consumer2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Consumer<Integer> consumer = x -> System.out.println(x);
		forEach(list, consumer);
		// 1
		// 2
		// 3
		// 4
		// 5
		
		 // call directly
		forEach(list, x -> System.out.println(x));
	}
	
	static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t: list) {
			consumer.accept(t);
		}
	}
}
