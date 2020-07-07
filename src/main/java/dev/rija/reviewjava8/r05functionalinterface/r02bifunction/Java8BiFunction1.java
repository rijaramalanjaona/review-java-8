package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

/**
 * This example takes two Integers and returns an Integer, Double or List
 * @FunctionalInterface
 * public interface BiFunction<T, U, R> {
 *
 *       R apply(T t, U u);
 *
 * }
 * T – Type of the first argument to the function.
 * U – Type of the second argument to the function.
 * R – Type of the result of the function.
 */
public class Java8BiFunction1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result = func.apply(2,3);
		System.out.println(result); // 5
		
		BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1,x2);
		Double result2 = func2.apply(2, 3);
		System.out.println(result2); // 8.0
		
		BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Collections.singletonList(x1 + x2);
		List<Integer> result3 = func3.apply(2, 3);
		System.out.println(result3); // [5]
	}
}
