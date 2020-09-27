package dev.rija.reviewjava8.r05functionalinterface.r04unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * UnaryOperator as argument
 */
public class Java8UnaryOperator2 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> result = math(list, x -> x * 2);
		System.out.println(result); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
	}
	
	public static <T> List<T> math(List<T> list, UnaryOperator<T> unaryOperator) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(unaryOperator.apply(t));
		}
		return result;
	}
}