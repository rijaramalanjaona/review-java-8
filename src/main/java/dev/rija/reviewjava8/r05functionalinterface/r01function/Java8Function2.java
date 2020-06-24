package dev.rija.reviewjava8.r05functionalinterface.r01function;

import java.util.function.Function;

/**
 * This example chains the Function with andThen()
 */
public class Java8Function2 {
	public static void main(String[] args) {
		Function<String, Integer> getLength = x -> x.length();
		
		Function<Integer, Integer> getDouble = x -> x * 2;
		
		Integer result = getLength.andThen(getDouble).apply("mkyong");
		
		System.out.println(result);
		// 12
	}
}
