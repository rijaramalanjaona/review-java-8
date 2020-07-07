package dev.rija.reviewjava8.r05functionalinterface.r03binaryoperator;

import java.util.function.IntBinaryOperator;

/**
 * If the math operations involve (implique) primitive types like int, change to IntBinaryOperator for better performance
 */
public class Java8BinaryOperator3IntBinaryOperator {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int result = math(numbers, 0, (a, b) -> a + b);
		System.out.println(result); // 55
		
		int result2 = math(numbers, 0, Integer::sum);
		System.out.println(result2); // 55
	}
	
	public static int math(int[] list, int init, IntBinaryOperator accumulator) {
		int result = init;
		for (int i: list) {
			result = accumulator.applyAsInt(result, i);
		}
		return result;
	}
	
}
