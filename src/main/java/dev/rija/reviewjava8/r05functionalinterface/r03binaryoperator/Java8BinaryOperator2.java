package dev.rija.reviewjava8.r05functionalinterface.r03binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * BinaryOperator as argument
 * This example simulates a stream.reduce() to sum all the Integer
 */
public class Java8BinaryOperator2 {
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
		System.out.println(result); // 55
		
		Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);
		System.out.println(result2); // 55
	}
	
	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
		T result = init;
		for (T t: list) {
			result = accumulator.apply(result, t);
		}
		return result;
	}
}
