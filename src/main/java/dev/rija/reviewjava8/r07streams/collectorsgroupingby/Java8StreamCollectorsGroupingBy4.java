package dev.rija.reviewjava8.r07streams.collectorsgroupingby;

import dev.rija.reviewjava8.common.entities.Item;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Group by a list of Pojo
 * Eg1 : group by price
 * Eg2 : group by price, uses 'mapping' to convert List<Item> to Set<String>
 */
public class Java8StreamCollectorsGroupingBy4 {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")),
				new Item("orange", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99"))
		);
		
		Map<BigDecimal, List<Item>> groupByPrice = items.stream()
				.collect(
						Collectors.groupingBy(
								Item::getPrice
						)
				);
		
		System.out.println(groupByPrice);
		/*
		 * {
		 * 19.99=[
		 * 			Item(name=banana, quantity=20, price=19.99),
		 * 			Item(name=banana, quantity=10, price=19.99)
		 * 		],
		 *
		 * 29.99=[
		 * 			Item(name=orange, quantity=10, price=29.99),
		 * 			Item(name=watermelon, quantity=10, price=29.99)
		 * 		],
		 *
		 * 9.99=[
		 * 			Item(name=apple, quantity=10, price=9.99),
		 * 			Item(name=papaya, quantity=20, price=9.99),
		 * 			Item(name=apple, quantity=10, price=9.99),
		 * 			Item(name=apple, quantity=20, price=9.99)
		 * 		]
		 * }
		 */
		
		// group by price, uses 'mapping' to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> result = items.stream()
				.collect(
						Collectors.groupingBy(
								Item::getPrice,
								Collectors.mapping(Item::getName, Collectors.toSet())
						)
				);
		
		System.out.println(result);
		/*
		 * {
		 * 		19.99=[banana],
		 * 		29.99=[orange, watermelon],
		 * 		9.99=[papaya, apple]
		 * }
		 */
	}
}
