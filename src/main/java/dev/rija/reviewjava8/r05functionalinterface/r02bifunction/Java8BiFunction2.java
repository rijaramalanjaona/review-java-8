package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * This BiFunction takes two Integer and returns a Double, and uses andThen() to chain it with a Function to convert the Double into a String.
 */
public class Java8BiFunction2 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> func = (x1, x2) -> Math.pow(x1, x2);
		
		Function<Double, String> func2 = x -> "Result: " + x;
		
		String result = func.andThen(func2).apply(2, 3);
		System.out.println(result); // Result: 8.0
	}
}
