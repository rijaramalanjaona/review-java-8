package dev.rija.reviewjava8.r06methodreference;

import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * 3. Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName
 * lambda expression
 * (arg0, rest_of_args) -> arg0.methodName(rest_of_args)
 * arg0 is the first argument
 * Eg : assume a and b are String
 * (a, b) -> a.compareToIgnoreCase(b)
 *
 * =>
 *
 * method reference
 * arg0_Type::methodName
 * arg0 is type of ClassName
 * ClassName::methodName
 *
 * Eg : String::compareToIgnoreCase
 *
 */
public class Java8MethodReference3A {
	public static void main(String[] args) {
		// lambda
		int result1 = playOneArgument("rija", x -> x.length());
		System.out.println(result1); // 4
		
		// method reference
		int result2 = playOneArgument("rija", String::length);
		System.out.println(result2); // 4
		
		// lambda
		boolean result3 = playTwoArgument("rija", "j", (s1, s2) -> s1.contains(s2));
		System.out.println(result3); // true
		
		// method reference
		boolean result4 = playTwoArgument("rija", "j", String::contains);
		System.out.println(result4); // true
		
		// lambda
		boolean result5 = playTwoArgument("rija", "j", (s1, s2) -> s1.startsWith(s2));
		System.out.println(result5); // false
		
		// method reference
		boolean result6 = playTwoArgument("rija", "j", String::startsWith);
		System.out.println(result6); // false
	}
	
	static <R> R playOneArgument(String s1, Function<String, R> func) {
		return func.apply(s1);
	}
	
	static boolean playTwoArgument(String s1, String s2, BiPredicate<String, String> func) {
		return func.test(s1, s2);
	}
}
