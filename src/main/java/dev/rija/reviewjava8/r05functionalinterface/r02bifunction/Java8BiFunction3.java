package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * This example converts the above program into a method that accepts BiFunction and Function as arguments and chains it together.
 */
public class Java8BiFunction3 {
	public static void main(String[] args) {
		String result = powToString(2, 3,
				(x1, x2) -> Math.pow(x1, x2),
				x -> "Result: " + x);
		System.out.println(result); // Result: 8.0
	}
	
	public static <R> R powToString(Integer x1, Integer x2,
									BiFunction<Integer, Integer, Double> func,
									Function<Double, R> func2) {
		return func.andThen(func2).apply(x1, x2);
	}
}
