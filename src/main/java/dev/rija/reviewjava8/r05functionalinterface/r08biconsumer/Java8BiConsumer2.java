package dev.rija.reviewjava8.r05functionalinterface.r08biconsumer;

import java.util.function.BiConsumer;

/**
 * This example accepts BiConsumer as an argument, create a generic addTwo to join two objects.
 */
public class Java8BiConsumer2 {
	public static void main(String[] args) {
		addTwo(1, 2, (x1, x2) -> System.out.println(x1 + x2));
		// 3
		
		addTwo("node", ".js", (x1, x2) -> System.out.println(x1 + x2));
		// node.js
	}
	
	static <T> void addTwo(T t1, T t2, BiConsumer<T, T> biConsumer) {
		biConsumer.accept(t1, t2);
	}
}
