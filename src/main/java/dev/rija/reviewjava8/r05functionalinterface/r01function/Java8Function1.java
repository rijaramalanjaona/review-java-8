package dev.rija.reviewjava8.r05functionalinterface.r01function;

import java.util.function.Function;

/**
 * This example takes a <T> String and returns the length of the string as <R> Integer
 * @FunctionalInterface
 * public interface Function<T, R> {
 *
 *       R apply(T t);
 *
 * }
 * T – Type of the input to the function.
 * R – Type of the result of the function.
 */
public class Java8Function1 {
	public static void main(String[] args) {
		Function<String, Integer> func = x -> x.length();
		
		Integer apply = func.apply("mkyong");
		
		System.out.println(apply);
		// 6
	}
}
