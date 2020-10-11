package dev.rija.reviewjava8.r05functionalinterface.r07consumer;

import java.util.function.Consumer;

/**
 * Consumer is a functional interface; it takes an argument and returns nothing.
 *
 * @FunctionalInterface
 * public interface Consumer<T> {
 *   void accept(T t);
 * }
 */
public class Java8Consumer1 {
	public static void main(String[] args) {
		Consumer<String> consumer = x -> System.out.println(x);
		// ou Consumer<String> consumer = System.out::println;
		consumer.accept("java"); // java
	}
}
