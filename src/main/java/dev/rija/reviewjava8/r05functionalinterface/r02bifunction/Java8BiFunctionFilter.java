package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Filtering a List by some conditions.
 */
public class Java8BiFunctionFilter {
	public static void main(String[] args) {
		Java8BiFunctionFilter obj = new Java8BiFunctionFilter();
		
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		List<String> result1 = obj.filterList(list, 3, obj::filterByLength);
		System.out.println(result1); // [node, java, javascript]
		
		List<String> result2 = obj.filterList(list, 3, (element, length) -> (element.length() > length) ? element : null);
		System.out.println(result2); // [node, java, javascript]
		
		List<String> result3 = obj.filterList(list, "c", (element, condition) -> {
			if (element.startsWith(condition)) {
				return element;
			}
			return null;
		});
		System.out.println(result3); // [c++]
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result4 = obj.filterList(numbers, 2, (number, condition) -> {
			if (number % condition == 0) {
				return number;
			}
			return null;
		});
		System.out.println(result4); // [2, 4]
		
	}
	
	public String filterByLength(String str, Integer length) {
		return (str.length() > length) ? str : null;
	}
	
	public <T, U, R> List<R> filterList(List<T> list,
										U condition,
										BiFunction<T, U, R> func) {
		List<R> result = new ArrayList<>();
		for (T t: list) {
			R apply = func.apply(t, condition);
			if (apply != null) {
				result.add(apply);
			}
		}
		return result;
	}
}
