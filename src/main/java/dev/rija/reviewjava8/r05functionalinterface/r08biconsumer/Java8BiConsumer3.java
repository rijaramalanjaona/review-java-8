package dev.rija.reviewjava8.r05functionalinterface.r08biconsumer;

import java.util.function.BiConsumer;

public class Java8BiConsumer3 {
	public static void main(String[] args) {
		math(1, 1, (x1, x2) -> System.out.println(x1 + x2)); // 2
		math(1, 1, (x1, x2) -> System.out.println(x1 - x2)); // 0
		math(1, 1, (x1, x2) -> System.out.println(x1 * x2)); // 1
		math(1, 1, (x1, x2) -> System.out.println(x1 / x2)); // 1
	}
	
	static <Integer> void math(Integer x1, Integer x2, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(x1, x2);
	}
}
