package dev.rija.reviewjava8.r05functionalinterface.r04unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * UnaryOperator is a functional interface and it extends Function
 * UnaryOperator takes one argument, and returns a result of the same type of its arguments.
 *
 * UnaryOperator.java
 * @FunctionalInterface
 * public interface UnaryOperator<T> extends Function<T, T> {
 * }
 *
 */
public class Java8UnaryOperator1 {
	public static void main(String[] args) {
		Function<Integer, Integer> func = x -> x * 2;
		Integer result = func.apply(2);
		System.out.println(result); // 4
		
		UnaryOperator<Integer> unary = x -> x * 2;
		Integer result2 = unary.apply(2);
		System.out.println(result2); // 4
	}
}
