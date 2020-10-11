package dev.rija.reviewjava8.r05functionalinterface.r08biconsumer;

import java.util.function.BiConsumer;

/**
 * BiConsumer is a functional interface; it takes two arguments and returns nothing.
 *
 * @FunctionalInterface
 * public interface BiConsumer<T, U> {
 *   void accept(T t, U u);
 * }
 */
public class Java8BiConsumer1 {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
		addTwo.accept(2, 3); // 5
	}
}
