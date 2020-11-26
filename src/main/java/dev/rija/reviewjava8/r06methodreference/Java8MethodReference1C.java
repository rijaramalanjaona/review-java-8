package dev.rija.reviewjava8.r06methodreference;

import java.util.function.BiFunction;

/**
 * 1. Static method
 * lambda expression
 * (args) -> ClassName.staticMethodName(args)
 * =>
 * method reference
 * ClassName::staticMethodName
 *
 * This example joins two Integer and returns a String.
 * It passes a method reference static method IntegerUtils::join as an argument into another method that accepts a BiFunction.
 */
public class Java8MethodReference1C {
	public static void main(String[] args) {
		// anonymous class
		String result1 = playTwoArguments(1, 2, new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer i1, Integer i2) {
				return IntegerUtils.join(i1, i2);
			}
		});
		System.out.println(result1);
		
		// lambda
		String result2 = playTwoArguments(1, 2, (a, b) -> IntegerUtils.join(a, b));
		System.out.println(result2);
		
		// method reference
		String result3 = playTwoArguments(1, 2, IntegerUtils::join);
		System.out.println(result3);
	}
	
	private static <R> R playTwoArguments(Integer x1, Integer x2,
										  BiFunction<Integer, Integer, R> func) {
		return func.apply(x1, x2);
	}
}

class IntegerUtils {
	public static String join(Integer a, Integer b) {
		return String.valueOf(a + b);
	}
}
