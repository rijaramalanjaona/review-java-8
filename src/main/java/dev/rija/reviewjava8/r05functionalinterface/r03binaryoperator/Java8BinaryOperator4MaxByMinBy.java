package dev.rija.reviewjava8.r05functionalinterface.r03binaryoperator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * This example uses BinaryOperator and a custom Comparator to find the highest and lowest pay developer from a list
 * of developers.
 */
public class Java8BinaryOperator4MaxByMinBy {
	public static void main(String[] args) {
		Developer dev1 = new Developer("jordan", BigDecimal.valueOf(9999));
		Developer dev2 = new Developer("jack", BigDecimal.valueOf(8888));
		Developer dev3 = new Developer("jaden", BigDecimal.valueOf(10000));
		Developer dev4 = new Developer("ali", BigDecimal.valueOf(2000));
		Developer dev5 = new Developer("mkyong", BigDecimal.valueOf(1));
		
		List<Developer> list = Arrays.asList(dev1, dev2, dev3, dev4, dev5);
		
		// 1. create a Comaprator
		Comparator<Developer> comparator = Comparator.comparing(Developer::getSalary);
		
		// 2. BinaryOperator with a custom Comparator
		BinaryOperator<Developer> bo = BinaryOperator.maxBy(comparator);
		Developer developer = find(list, bo);
		System.out.println(developer); // Developer(name=jaden, salary=10000)
		
		// one line
		Developer developerWithHighestSalary = find(list, BinaryOperator.maxBy(Comparator.comparing(Developer::getSalary)));
		System.out.println(developerWithHighestSalary); // Developer(name=jaden, salary=10000)
		
		Developer developerWithLowestSalary = find(list, BinaryOperator.minBy(Comparator.comparing(Developer::getSalary)));
		System.out.println(developerWithLowestSalary); // Developer(name=mkyong, salary=1)
		
	}
	
	public static Developer find(List<Developer> list, BinaryOperator<Developer> func) {
		Developer result = null;
		for (Developer developer: list) {
			if (result == null) {
				result = developer;
			} else {
				result = func.apply(result, developer);
			}
		}
		return result;
	}
}

@Data
@AllArgsConstructor
class Developer {
	String name;
	BigDecimal salary;
}
