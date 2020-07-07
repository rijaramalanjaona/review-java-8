package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * This example converts the above method into a generic method
 */
public class Java8BiFunction3ToGeneric {
	public static void main(String[] args) {
		// Take two Integers, pow it into a Double, convert Double into a String.
		String result = convert(2, 3,
				(x1, x2) -> Math.pow(x1, x2),
				x -> "Pow: " + x);
		System.out.println(result); // Pow: 8.0
		
		// Take two Integers, multiply into an Integer, convert Integer into a String.
		String result2 = convert(2, 3,
				(x1, x2) -> x1 * x2,
				x -> "Multiply: " + x);
		System.out.println(result2); // Multiply: 6
		
		// Take two Strings, join both, join "cde"
		String result3 = convert("java", "bifunction",
				(x1, x2) -> x1 + x2,
				x -> x + "cde");
		System.out.println(result3); // javabifunctioncde
		
		// Take two Strings, join both, convert it into an Integer
		Integer result4 = convert("100", "200",
				(x1, x2) -> x1 + x2,
				x -> Integer.parseInt(x));
		System.out.println(result4); // 100200
		
	}
	
	public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
											  BiFunction<A1, A2, R1> func,
											  Function<R1, R2> func2) {
		return func.andThen(func2).apply(a1, a2);
	}
}
