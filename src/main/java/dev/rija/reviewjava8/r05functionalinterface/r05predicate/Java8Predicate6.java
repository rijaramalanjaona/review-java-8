package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import java.util.function.Predicate;

/**
 * Predicate .test() and chain predicates together.
 */
public class Java8Predicate6 {
	public static void main(String[] args) {
		Predicate<String> startWithA = x -> x.startsWith("a");
		
		// start with a or m
		boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
		System.out.println(result); // true
		
		// !(start with a and length is 3)
		boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
		System.out.println(result2); // false
	}
}
