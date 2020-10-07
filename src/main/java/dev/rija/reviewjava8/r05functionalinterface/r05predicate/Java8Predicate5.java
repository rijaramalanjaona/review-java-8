package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate.test() in function
 */
public class Java8Predicate5 {
	public static void main(String[] args) {
	
	List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		List<String> filtered1 = StringProcessor.filter(list, x -> x.startsWith("A"));
		System.out.println(filtered1); // [A, AA, AAA]
		
		List<String> filtered2 = StringProcessor.filter(list, x -> x.startsWith("A") && x.length() == 3);
		System.out.println(filtered2); // [AAA]
	}
}

class StringProcessor {
	static List<String> filter(List<String> list, Predicate<String> predicate) {
		return list.stream()
				.filter(predicate::test) // method reference can be remplaced with qualifier => filter(predicate)
				.collect(Collectors.toList());
	}
}
