package dev.rija.reviewjava8.r07streams.reduce;

import java.util.Arrays;

/**
 * Stream.reduce() method signature:
 * - Stream.java
 * T reduce(T identity, BinaryOperator<T> accumulator);
 *
 * - IntStream.java
 * int reduce(int identity, IntBinaryOperator op);
 *
 * - LongStream.java
 * long reduce(int identity, LongBinaryOperator op);
 *
 * identity = default or initial value.
 * BinaryOperator = functional interface, take two values and produces a new value.
 *
 * if the identity argument is missing, there is no default or initial value, and it returns an optional.
 * Optional<T> reduce(BinaryOperator<T> accumulator);
 */
public class Java8StreamReduce1 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum1 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println(sum1); // 55
		
		int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println(sum2); // 55
		
		int result = Arrays.stream(numbers).reduce(0, (a, b) -> a -b);
		System.out.println(result); // -55
		
		int max1 = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max1); // 10
		
		int max2 = Arrays.stream(numbers).reduce(0, Integer::max);
		System.out.println(max2); // 10
		
		int min = Arrays.stream(numbers).reduce(0, Integer::min);
		System.out.println(min); // 0
	}
}
