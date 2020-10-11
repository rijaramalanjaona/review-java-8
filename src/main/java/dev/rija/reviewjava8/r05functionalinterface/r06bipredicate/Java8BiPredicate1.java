package dev.rija.reviewjava8.r05functionalinterface.r06bipredicate;

import java.util.function.BiPredicate;

/**
 * BiPredicate is a functional interface, which accepts two arguments and returns a boolean
 *
 * @FunctionalInterface
 * public interface BiPredicate<T, U> {
 *     boolean test(T t, U u);
 * }
 *
 * If the String length matches the provided length?
 */
public class Java8BiPredicate1 {
	public static void main(String[] args) {
		BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() == y;
		
		boolean result1 = biPredicate.test("mkyong", 6);
		System.out.println(result1); // true
		
		boolean result2 = biPredicate.test("java", 10);
		System.out.println(result2); // false
	}
	
}
